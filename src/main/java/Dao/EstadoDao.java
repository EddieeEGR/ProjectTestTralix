package Dao;

import java.util.List;
import Model.Tbestado;
import Model.Tbmunicipio;

public interface EstadoDao {
	public List<Tbestado> listaEstados();
	public List<Tbmunicipio> listaMubicipios( Tbestado estado);

}
