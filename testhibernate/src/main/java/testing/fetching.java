package testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetching {
    static void main(String[] args) {
        student s2=null ;

        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(testing.student.class);

        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();

        s2=session.get(student.class,102);
        session.close();
        sf.close();

        /*the result of fetching data is converted to the object format
        so if we wana see the data we have to print the object */
        System.out.println(s2);
    }
}
