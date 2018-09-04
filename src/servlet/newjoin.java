package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import modelo.alta_user;

/**
 * Servlet implementation class newjoin
 */
@WebServlet("/nuevousuario")
public class newjoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newjoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		alta_user usr = new alta_user();
		
		String nombre=request.getParameter("nombre");
		String correo=request.getParameter("correo");
		int nivel=Integer.parseInt(request.getParameter("nivel"));
		int cabina=Integer.parseInt(request.getParameter("cabina"));
		String usuario=request.getParameter("usuario");
		String clave=request.getParameter("clave");
		
		usr.setNombre(nombre);
		usr.setCorreo(correo);
		usr.setNivel(nivel);
		usr.setCabina(cabina);
		usr.setUsuario(usuario);
		usr.setClave(clave);
		
		if (nombre != null && correo != null && nivel != 0 && cabina != 0 && usuario != null && clave != null) {
			
			usr.registro(nombre, correo);
			usr.registro_n(nivel);
			usr.registro_o(cabina, usuario, clave);	
			response.sendRedirect("newuser.jsp");
			
		}else {
			
			System.out.println("Faltan campos por llenar");
		
	
	}

}
	
}