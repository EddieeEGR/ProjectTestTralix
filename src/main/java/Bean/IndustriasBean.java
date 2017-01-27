package Bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import Dao.IndustriaDao;
import Imp.IndustriaDaoImp;
import Model.Tbindustrias;

@ManagedBean
@RequestScoped
public class IndustriasBean {
	private List<SelectItem> listIndustrias;
	private Tbindustrias industrias;
	//private List<Tbindustrias> listIndustrias;

	public IndustriasBean(){
		industrias = new Tbindustrias();
	}

	public Tbindustrias getIndustrias() {
		return industrias;
	}

	public void setIndustrias(Tbindustrias industrias) {
		this.industrias = industrias;
	}

	public List<SelectItem> getListIndustrias() {
		this.listIndustrias=new ArrayList<SelectItem>();
		IndustriaDao iDao = new IndustriaDaoImp();
		
		List<Tbindustrias> i = iDao.listaIndustrias();
		listIndustrias.clear();
		
		for (Tbindustrias industrias : i){
			SelectItem industriaItem = new SelectItem(industrias.getId(), industrias.getNombre());
			this.listIndustrias.add(industriaItem);
		}
		
		
		return listIndustrias;
	}
	
	//public void changeIndustria() {
	  //  input = industrias.getId();
	//}
	
}
