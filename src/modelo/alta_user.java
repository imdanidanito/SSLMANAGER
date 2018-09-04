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
	
	public void  registro (String nombre, String correo) {
		
		Statement st=null;
		PreparedStatement ps=null;
		
		
		try {
			
			st=getConexion().createStatement();
			
			String consulta="SELECT MAX(id_persona) FROM persona";
			
			ResultSet Mirs= st.executeQuery(consulta);
			
			Mirs.next();
			
			int valor = Mirs.getInt("MAX(id_persona)") + 1;
			
			String sql 	= "INSERT INTO persona(id_persona,nombre,email) VALUES(?,?,?)";
			
			ps=getConexion().prepareStatement(sql);
			
			ps.setInt(1, valor);
			ps.setString(2, this.getNombre());
			ps.setString(3, this.getCorreo());
			
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
	
	public void registro_n (int nivel) {
		
		PreparedStatement ps1=null;
		Statement st1=null;
		
		try {
			
			st1=getConexion().createStatement();
			
			String consulta1="SELECT MAX(id_rol) FROM rol";
			
			ResultSet Mirs1=st1.executeQuery(consulta1);
			
			Mirs1.next();
			
			int valor1=Mirs1.getInt("MAX(id_rol)") + 1;
					
			String sql="INSERT INTO rol (id_rol, descripcion) VALUES(?,?)";
			
			ps1=getConexion().prepareStatement(sql);
			
	 	 	ps1.setInt(1, valor1);
			ps1.setInt(2, this.getNivel());
			
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
	
	public void registro_o (int cabina, String usuario, String clave) {
		
		Connection con= getConexion();
		PreparedStatement pst=null;
		Statement st2=null;
		
		try {
			
			Statement ps2 = con.createStatement();
			st2=getConexion().createStatement();
			
			String consulta2="SELECT MAX(n_empleado) FROM operador";
			
			ResultSet Mirs2=st2.executeQuery(consulta2);
			
			Mirs2.next();
			
			int valor2=Mirs2.getInt("MAX(n_empleado)") + 1;
			
		
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
			
			pst.setInt(1, valor2);
			pst.setInt(2,columna_p);
			pst.setInt(3, this.getCabina());
			pst.setString(4, this.getUsuario());
			pst.setString(5, this.getClave());
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
