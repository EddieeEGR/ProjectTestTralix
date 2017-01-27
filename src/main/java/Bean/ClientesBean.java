package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Dao.ClienteDao;
import Imp.ClienteDaoImp;
import Model.Clientes;

@ManagedBean
@RequestScoped
public class ClientesBean {
	
	private Clientes clientes;
	
	public ClientesBean(){
		
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	
	public void nuevoCliente(){
		ClienteDao cDao = new ClienteDaoImp();
		cDao.nuevoCliente(clientes);
		clientes = new Clientes();
	}

}
