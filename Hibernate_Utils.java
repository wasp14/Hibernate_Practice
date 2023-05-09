package Hibernate_Practice.Prac;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

//Database or Hibernate Configuration with Java

public class Hibernate_Utils {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSeesionFactory()
	{
		if(sessionFactory == null)
		{
			Configuration cg = new Configuration();
			Properties p = new Properties();
			p.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			p.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			p.put(Environment.USER, "Anirudha");
			p.put(Environment.PASS, "sam");
			p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
			p.put(Environment.SHOW_SQL, "true");
			p.put(Environment.HBM2DDL_AUTO, "update");
			 
			cg.setProperties(p);
			cg.addAnnotatedClass(Employee.class);
			cg.addAnnotatedClass(Order.class);
			ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cg.getProperties()).build();
		    sessionFactory = cg.buildSessionFactory(sr);
		
		}
		
		return sessionFactory;
		
	}
	
	
}
