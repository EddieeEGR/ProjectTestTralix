package Util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			
		}
		catch (Throwable ex) {
			
			System.err.println("La conexi�n fallo" + ex);
			throw new ExceptionInInitializerError(ex);
		}	
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}