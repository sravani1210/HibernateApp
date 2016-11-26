package ar.com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		System.out.println("class loaded");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		System.out.println("connection started");
		Transaction transaction=session.beginTransaction();
		Developer developer=new Developer();
		developer.setUserName("srini");
		session.save(developer);
		transaction.commit();
		session.close();
		System.out.println("completed");
	}
}
