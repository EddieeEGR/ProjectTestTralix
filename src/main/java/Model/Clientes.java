package Model;
// Generated 27/01/2017 12:39:49 PM by Hibernate Tools 5.2.0.CR1

/**
 * Clientes generated by hbm2java
 */
public class Clientes implements java.io.Serializable {

	private Integer id;
	private Tbindustrias tbindustrias;
	private Tbmunicipio tbmunicipio;
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String email;

	public Clientes() {
	}

	public Clientes(Tbindustrias tbindustrias, Tbmunicipio tbmunicipio, String nombre, String apellidoP,
			String apellidoM, String email) {
		this.tbindustrias = tbindustrias;
		this.tbmunicipio = tbmunicipio;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tbindustrias getTbindustrias() {
		return this.tbindustrias;
	}

	public void setTbindustrias(Tbindustrias tbindustrias) {
		this.tbindustrias = tbindustrias;
	}

	public Tbmunicipio getTbmunicipio() {
		return this.tbmunicipio;
	}

	public void setTbmunicipio(Tbmunicipio tbmunicipio) {
		this.tbmunicipio = tbmunicipio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return this.apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return this.apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
