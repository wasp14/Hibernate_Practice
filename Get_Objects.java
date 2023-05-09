package Hibernate_Practice.Prac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Get_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = Hibernate_Utils.getSeesionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Order o1 = session.get(Order.class, 13);
		Order o2 = session.get(Order.class, 15);
		Employee e1 = session.get(Employee.class, 1);
		Employee e2 = session.get(Employee.class, 2);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(e1);
		System.out.println(e2);
	}

}
