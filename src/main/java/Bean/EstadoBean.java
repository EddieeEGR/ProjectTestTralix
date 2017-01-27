package Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import Dao.EstadoDao;
import Imp.EstadoDaoImp;
import Model.Tbestado;
import Model.Tbmunicipio;

@ManagedBean
@RequestScoped
public class EstadoBean {
	private List<SelectItem> listEstados;
	private List<SelectItem> listMunicipios;
	private Tbestado estado;
	private Tbmunicipio municipio;
	
	public EstadoBean(){
		estado = new Tbestado();
		municipio = new Tbmunicipio();
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


	public Tbmunicipio getMunicipio() {
		return municipio;
	}


	public List<SelectItem> getListMunicipios() {
		this.listMunicipios = new ArrayList<SelectItem>();
		EstadoDao eDao = new EstadoDaoImp();
		List<Tbmunicipio> e = eDao.listaMubicipios(this.estado);
		listMunicipios.clear();
		
		for(Tbmunicipio municipios : e){
			SelectItem municipiosItem = new SelectItem(municipios.getId(), municipios.getNombre());
			this.listMunicipios.add(municipiosItem);
		}
		
		return listMunicipios;
	}
	
	
	
	

}
