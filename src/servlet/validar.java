package servlet;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.persona;
import modelo.usuario;

/**
 * Servlet implementation class validar
 */
@WebServlet("/validar")
public class validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario=request.getParameter("usuario");
		String clave=request.getParameter("clave");
		
		persona i = new persona();
		i.validacion(usuario, clave);
		
		if(i != null) {
			
			usuario x = new usuario();
			
			x.setNombre(i.getUsuario_nombre());
			x.setUsuario(i.getUsuario_user());
			x.setCabina(i.getUsuario_cabina());
			x.setPrive(i.getUsuario_priv());
			
			int cab = i.getUsuario_cabina();
			
			if(cab ==3) {
				
				x.setCliente("Santander");
				
			}else if(cab ==6) {
				
				x.setCliente("HSBC");
			}
			
			HttpSession sesion=request.getSession(true);
			sesion.setAttribute("datos", i);
			
			HttpSession sesionOk=request.getSession();
			sesionOk.setAttribute("datos", x);
			
			if(i.getUsuario_priv()==1) {
				
				response.sendRedirect("inicio.jsp");
				
			}else if(i.getUsuario_priv()==2) {
				
				response.sendRedirect("inicioGold.jsp");
				
			}else {
				
				response.sendRedirect("index.jsp");
				
			}
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
