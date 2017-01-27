package Model;
// Generated 27/01/2017 12:39:49 PM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Tbmunicipio generated by hbm2java
 */
public class Tbmunicipio implements java.io.Serializable {

	private int id;
	private Tbestado tbestado;
	private String nombre;
	private Set<Clientes> clienteses = new HashSet<Clientes>(0);

	public Tbmunicipio() {
	}

	public Tbmunicipio(int id, Tbestado tbestado, String nombre) {
		this.id = id;
		this.tbestado = tbestado;
		this.nombre = nombre;
	}

	public Tbmunicipio(int id, Tbestado tbestado, String nombre, Set<Clientes> clienteses) {
		this.id = id;
		this.tbestado = tbestado;
		this.nombre = nombre;
		this.clienteses = clienteses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tbestado getTbestado() {
		return this.tbestado;
	}

	public void setTbestado(Tbestado tbestado) {
		this.tbestado = tbestado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Clientes> getClienteses() {
		return this.clienteses;
	}

	public void setClienteses(Set<Clientes> clienteses) {
		this.clienteses = clienteses;
	}

}