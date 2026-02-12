package testing;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.util.Arrays;

public class main {
    static void main(String[] args) {

        laptop l1=new laptop();
        l1.setLid(3);
        l1.setBrand("TUF");
        l1.setModel("A15");
        l1.setRam_in_GB(32);

        laptop l2=new laptop();
        l2.setLid(5);
        l2.setBrand("TUF15");
        l2.setModel("A152");
        l2.setRam_in_GB(32);


        Alien s1=new Alien();
        s1.setMarks(91);
        s1.setName("GREEN");
        s1.setRoll_no(222);
        l1.setAlien(s1);
        l2.setAlien(s1);
        s1.setLaptop( Arrays.asList(l1,l2));

        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(testing.laptop.class);
        cfg.addAnnotatedClass(testing.Alien.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession( );
        Transaction transaction=session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(s1);
        // System.out.println(session.get(student.class,101));
        transaction.commit();
        session.clear();
        sf.close();
        System.out.println(s1);
    }
}
