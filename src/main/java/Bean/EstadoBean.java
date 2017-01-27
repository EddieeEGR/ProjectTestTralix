package Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import Dao.EstadoDao;
import Imp.EstadoDaoImp;
import Model.Tbestado;

@ManagedBean
@RequestScoped
public class EstadoBean {
	private List<SelectItem> listEstados;
	private Tbestado estado;
	
	
	public EstadoBean(){
		estado = new Tbestado();
	}


	public Tbestado getEstado() {
		return estado;
	}


	public void setEstado(Tbestado estado) {
		this.estado = estado;
	}


	public List<SelectItem> getListEstados() {
		this.listEstados= new ArrayList<SelectItem>();
		EstadoDao eDao = new EstadoDaoImp();
		
		List<Tbestado> e = eDao.listaEstados();
		listEstados.clear();
		
		for(Tbestado estados : e){
			SelectItem estadoItem = new SelectItem(estados.getId(), estados.getNombre());
			this.listEstados.add(estadoItem);
		}
		
		return listEstados;
	}
	
	

}
