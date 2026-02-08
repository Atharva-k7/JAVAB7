package testing;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class main {
    static void main(String[] args) {
        student s1=new student();
        s1.setMarks(78);
        s1.setName("Atharv");
        s1.setRoll_no(107);

        System.out.println(s1);
        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(testing.student.class);



        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession( );
        Transaction transaction=session.beginTransaction();

        session.save(s1);
        transaction.commit();
    }
}
