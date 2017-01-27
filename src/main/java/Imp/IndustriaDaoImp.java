package Imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.IndustriaDao;
import Model.Tbindustrias;
import Util.HibernateUtil;

public class IndustriaDaoImp implements IndustriaDao{

	@Override
	public List<Tbindustrias> listaIndustrias() {
		// TODO Auto-generated method stub
		
		List<Tbindustrias> listarIndustrias=null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String hql = "FROM Tbindustrias";
		
		try{
			listarIndustrias = session.createQuery(hql).list();
			t.commit();
			session.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		return listarIndustrias;
	}

}
