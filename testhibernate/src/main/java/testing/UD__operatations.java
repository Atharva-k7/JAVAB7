package testing;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.naming.ConfigurationException;

public class UD__operatations {
    static void main(String[] args) {
        student s3=new student();
        s3.setName("5thtopper");
        s3.setMarks(90);
        s3.setRoll_no(101);


        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(testing.student.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();

        Transaction transaction= session.beginTransaction();
        session.remove(s3);
        transaction.commit();


        sf.close();
        session.close();

    }
}
