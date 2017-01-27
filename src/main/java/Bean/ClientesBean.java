package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import Dao.ClienteDao;
import Dao.IndustriaDao;
import Imp.ClienteDaoImp;
import Imp.IndustriaDaoImp;
import Model.Clientes;
import Model.Tbindustrias;

@ManagedBean
@RequestScoped
public class ClientesBean {
	
	private Clientes clientes;
	
	public void nuevoCliente(){
		ClienteDao cDao = new ClienteDaoImp();
		cDao.nuevoCliente(clientes);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Correcto","El registro se guardó satisfactoriamente"));
	}
	
	public ClientesBean(){
		clientes = new Clientes();
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	
	public void cancelar(){
		clientes = new Clientes();		
		
	}

}
