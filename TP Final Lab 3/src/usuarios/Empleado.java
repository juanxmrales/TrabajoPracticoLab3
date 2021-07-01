package usuarios;

public class Empleado extends Persona
{
	private String usuario;
	private String clave;
	private String puesto;
	private boolean esAdmin;
	
	public Empleado() {
	}
	
	public Empleado(String nombre, String apellido, String direccion, String usuario, String clave, String puesto, boolean esAdmin) 
	{
		super(nombre, apellido, direccion);
		this.usuario = usuario;
		this.clave = clave;
		this.puesto = puesto;
		this.esAdmin = esAdmin;
	}
	

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public boolean isEsAdmin() {
		return esAdmin;
	}


	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}


	@Override
	public String toString() {
		return super.toString() + "Empleado [usuario=" + usuario + ", clave=" + clave + ", puesto=" + puesto + ", esAdmin=" + esAdmin
				+ "]";
	}
	
	
	
	
	
}
