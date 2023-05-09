package Hibernate_Practice.Prac;





import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        //
    	// XML based Hibernate Configuration
//        Configuration cg = new Configuration();
//        cg.configure();
//        SessionFactory s = cg.buildSessionFactory();
//        Session j = s.openSession();
//        j.save(new Employee(1,"Anirudha","Gaikwad",04));
//        
//        
    	// Java Class based Hibernate Configuration
    	
     SessionFactory sessionFactory = Hibernate_Utils.getSeesionFactory();
       Session session = sessionFactory.openSession();
       System.out.println(sessionFactory);
       System.out.println(session);
       
       Transaction tx = session.beginTransaction();
    	//session.save(new Employee(1,"Anirudha","Gaikwad",04));
    //	Employee e2 = new Employee(2,"Sam","Gaikwad",05);
    	//Employee e3 = new Employee(3,"Abhineel","Dandge",8, new Date(2018,02,04));
    	//session.save(e2);
    	//e2.setFirst_name("Wasp");
    	//
    	//Order o1 = new Order("Fashion",new Date(2023,05,03), new Date(),"Amazon");
    	//Order o2 = new Order("Electronics",new Date(2023,02,01), new Date(2023,02,01),"Amazon");
    	//session.save(e3);
    	//ession.update(e2);
//    	session.save(o1);
//    	session.save(o2);
       
       Order o3 = new Order("Home Appliances",new Date(2023,05,03), new Date(),"Amazon" );
       session.save(o3);
       
       
       
    	tx.commit();
    	session.close();
    }
}
