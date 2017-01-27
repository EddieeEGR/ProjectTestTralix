package Model;
// Generated 27/01/2017 12:39:49 PM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tbestado generated by hbm2java
 */
public class Tbestado implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String clave;
	private Set<Tbmunicipio> tbmunicipios = new HashSet<Tbmunicipio>(0);

	public Tbestado() {
	}

	public Tbestado(String nombre, String clave) {
		this.nombre = nombre;
		this.clave = clave;
	}

	public Tbestado(String nombre, String clave, Set<Tbmunicipio> tbmunicipios) {
		this.nombre = nombre;
		this.clave = clave;
		this.tbmunicipios = tbmunicipios;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Set<Tbmunicipio> getTbmunicipios() {
		return this.tbmunicipios;
	}

	public void setTbmunicipios(Set<Tbmunicipio> tbmunicipios) {
		this.tbmunicipios = tbmunicipios;
	}

}
