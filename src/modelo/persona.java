package modelo;

import java.sql.*;

public class persona extends miConexion{
	
	private String usuario_nombre;
	private String usuario_user;
	private int usuario_cabina;
	private int usuario_priv;
	
	public persona() {
		
		
	}
	
	public persona validacion(String usuario, String clave) {
		
		persona i=null;
		PreparedStatement  pst=null;
		ResultSet rs=null;
		
		try {
			
			String consulta="SELECT p.nombre,o.cabina,o.usuario,o.clave,r.descripcion FROM persona p,operador o,rol r WHERE usuario=? AND clave=? AND o.n_empleado=p.id_persona AND r.id_rol=o.n_empleado";
			
			pst=getConexion().prepareStatement(consulta);
			pst.setString(1, usuario);
			pst.setString(2, clave);
			
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				i=new persona();
				
				this.setUsuario_nombre(rs.getString("nombre"));
				this.setUsuario_user(rs.getString("usuario"));
				this.setUsuario_cabina(rs.getInt("cabina"));
				this.setUsuario_priv(rs.getInt(5));
				
				
				break;
	
			}
			
			
			
			 /*int texto=this.getUsuario_priv();
			String x=this.getUsuario_nombre();
			
			if(rs.next()) {
				
				System.out.println(texto);
				System.out.println(x);
				
			
			}*/
		
			
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
			i=null;
			
		}finally {
			
			try {
				
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();
				if(rs != null) rs.close();
				
			}catch(SQLException ex) {
				
				
			}
			
		}

		
	
		
		return i;
		
		
	}
	
	
	
	public String getUsuario_nombre() {
		
		return this.usuario_nombre;
		
	}
	
	public String getUsuario_user() {
		
		return this.usuario_user;
	}
	
	public int getUsuario_cabina() {
		
		return this.usuario_cabina;
		
	}
	
	public int getUsuario_priv() {
		
		return this.usuario_priv;
		
	}
	
	public void setUsuario_nombre(String usuario_nombre) {
		
		this.usuario_nombre=usuario_nombre;
		
	}
	
	public void setUsuario_user(String usuario_user) {
		
		this.usuario_user=usuario_user;
	}
	
	public void setUsuario_cabina(int usuario_cabina) {
		
		this.usuario_cabina=usuario_cabina;
		
	}
	
	public void setUsuario_priv(int usuario_priv) {
		
		this.usuario_priv=usuario_priv;
	}
	

}