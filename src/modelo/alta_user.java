package modelo;

import java.sql.*;


public class alta_user extends miConexion {
	
	private String nombre;
	private String correo;
	private String usuario;
	private String clave;
	private int id;
	private int id_r;
	private int id_o;
	private int cabina;
	private int nivel;
	
	public void  registro (int id, String nombre, String correo) {
		
		
		PreparedStatement ps=null;
		
		
		try {
			
			String sql 	= "INSERT INTO persona(id_persona,nombre,email) VALUES(?,?,?)";
			
			ps=getConexion().prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, correo);
			
			ps.executeLargeUpdate();
				
			
		}catch(SQLException ex) {
			
			System.err.println(ex);
			
		}finally {
			
			try {
				
				
				if(ps != null) ps.close();
				
			}catch(Exception e) {
				
				System.err.println(e);
				
			}
			
		}
			
		
	}
	
	public void registro_n (int id_r,int nivel) {
		
		PreparedStatement ps1=null;
		
		try {
			
			String sql="INSERT INTO rol (id_rol, descripcion) VALUES(?,?)";
			
			ps1=getConexion().prepareStatement(sql);
			
	 	 	ps1.setInt(1, id_r);
			ps1.setInt(2, nivel);
			
			ps1.executeUpdate();
			
		}catch(SQLException e) {
			
			System.err.println(e);
			
		}finally {
			
			try {
				
				if(ps1 != null) ps1.close();
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
				
			}
			
		}
	
	public void registro_o (int id_o, int cabina, String usuario, String clave) {
		
		Connection con= getConexion();
		PreparedStatement pst=null;
		
		try {
			
			Statement ps2 = con.createStatement();
			
		
			String i = "SELECT MAX(id_persona) FROM persona";
			
			ResultSet rs=ps2.executeQuery(i);
			
			rs.next();
				
			int columna_p = rs.getInt("MAX(id_persona)");	

			
			Statement ps3 = con.createStatement();
				
			String j = "SELECT MAX(id_rol) FROM rol";
			
			ResultSet rs1=ps3.executeQuery(j);
			
			rs1.next();
				
			int columna_r = rs1.getInt("MAX(id_rol)");
			
			String sql="iNSERT INTO operador VALUES(?,?,?,?,?,?)";
			
			pst=getConexion().prepareStatement(sql);
			
			pst.setInt(1, id_o);
			pst.setInt(2,columna_p);
			pst.setInt(3, cabina);
			pst.setString(4, usuario);
			pst.setString(5, clave);
			pst.setInt(6, columna_r);
			
			pst.executeUpdate();
		
			
		}catch(SQLException ex) {
			
			System.err.println(ex);
			
		}finally {
			
			try {
				if(getConexion() != null) getConexion().close();
				if(pst != null) pst.close();	
				
			}catch(Exception e) {
				
				System.out.println(e);
			}
				
			}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_r() {
		return id_r;
	}

	public void setId_r(int id_r) {
		this.id_r = id_r;
	}

	public int getId_o() {
		return id_o;
	}

	public void setId_o(int id_o) {
		this.id_o = id_o;
	}

	public int getCabina() {
		return cabina;
	}

	public void setCabina(int cabina) {
		this.cabina = cabina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
		
	
	}
