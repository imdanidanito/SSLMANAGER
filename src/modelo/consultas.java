package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class consultas extends miConexion {
	
	private String user_nombre;
	private String user_user;
	private int user_cabina;
	private String user_priv;
	
	public consultas() {
		
		
	}

	public boolean autenticacion(String usuario, String pass) {
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			
			String consulta ="SELECT p.nombre,o.cabina,o.usuario,o.clave,r.descripcion FROM persona p,operador o,rol r WHERE usuario=? AND clave=? AND o.n_empleado=p.id_persona";
			
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, usuario);
			pst.setString(2, pass);
			
			rs=pst.executeQuery();
			
			consultas x=new consultas();
			
			while(rs.next()){
				
				x.setUser_nombre(rs.getString("nombre"));
				x.setUser_user(rs.getString("usuario"));
				x.setUser_cabina(rs.getInt("cabina"));
				x.setUser_priv(rs.getString("descripcion"));
				
				break;
				
			}
			
			if(rs.absolute(1)) {
				
				return true;
			}
			
			
		}catch(Exception e) {
			
			System.err.println("Error" + e);
			
		}finally{
			
			try {
				
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				if(rs != null) rs.close();
				
			}catch(Exception e) {
				
				System.err.println("Error" + e);
				
			}
			
		}
		
		return false;
		
	}
	
	public static void main(String[] args){
		
		consultas co=new consultas();
		
		System.out.println(co.autenticacion("dmillan", "123456"));
		
	}
	
	public String getUser_nombre() {
		
		return this.user_nombre;
		
	}
	
	public String getUser_user() {
		
		return this.user_user;
		
	}
	
	public int getUser_cabina() {
		
		return this.user_cabina;
		
	}
	
	public String getUser_priv() {
		
		return this.user_priv;
		
	}
	
	public void setUser_nombre(String user_nombre) {
		
		this.user_nombre=user_nombre;
		
	}
	
	public void setUser_user(String user_user) {
		
		this.user_user=user_user;
		
	}
	
	public void setUser_cabina(int user_cabina) {
		
		this.user_cabina=user_cabina;
		
	}
	
	public void setUser_priv(String user_priv) {
		
		this.user_priv=user_priv;
		
	}
	
}
