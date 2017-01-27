package Imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.EstadoDao;
import Model.Tbestado;
import Model.Tbmunicipio;
import Util.HibernateUtil;

public class EstadoDaoImp implements EstadoDao {

	public List<Tbestado> listaEstados() {
		// TODO Auto-generated method stub
		List<Tbestado> listarEstados = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String hql = "FROM Tbestado";
		try {
			listarEstados = session.createQuery(hql).list();
			t.commit();
			session.close();
			
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		return listarEstados;
		}

	@Override
	public List<Tbmunicipio> listaMubicipios(Tbestado estado) {
		List<Tbmunicipio> listarMunicipios = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String hql = "FROM Tbmunicipio WHERE id_estado ="+estado.getId();
		try {
			listarMunicipios = session.createQuery(hql).list();
			t.commit();
			session.close();
			
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
			t.rollback();
		}
		
		return listarMunicipios;
		}
}
