package modelo;

public class alta {
	
	private String usuario;
	private String correo;
	private int nivel;
	
	public alta() {
		
		
		
	}
	
	public alta(int nivel, String usuario, String correo) {
		
		this.nivel=nivel;
		this.usuario=usuario;
		this.correo=correo;
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
