package Imp;

import org.hibernate.Session;

import Dao.ClienteDao;
import Model.Clientes;
import Util.HibernateUtil;

public class ClienteDaoImp implements ClienteDao {

	@Override
	public void nuevoCliente(Clientes clientes) {
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(clientes);
			session.getTransaction().commit();			
		}
		catch( Exception e){
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		}
		finally{
			if (session!=null){
				session.close();
			}
		}
		
	}

}
