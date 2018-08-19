package modelo;

public class usuario {
	
	private String nombre;
	private String usuario;
	private String cliente;
	private int cabina;
	private int prive;
	
	public String getNombre() {
		
		return nombre;
	}
	
	public String getUsuario() {
		
		return usuario;
	}
	
	public int getCabina() {
		
		return cabina;
		
	}
	
	public int getPrive() {
		
		return prive;
		
	}
	
	public String getCliente() {
		
		return cliente;
	}
	
	
	public void setNombre(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	public void setUsuario(String usuario) {
		
		
		this.usuario=usuario;
	}
	
	public void setCabina(int cabina){
		
		this.cabina=cabina;
		
	}
	
	public void setPrive(int prive) {
		
		this.prive=prive;
	}
	
	public void setCliente(String cliente) {
		
		this.cliente=cliente;
		
	}

}
