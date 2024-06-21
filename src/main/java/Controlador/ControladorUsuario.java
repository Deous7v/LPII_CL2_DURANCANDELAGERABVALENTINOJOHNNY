package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
       // super();
        // TODO Auto-generated constructor stub
    }   //fin del constructor...

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Mostrar el formulario de login
        request.getRequestDispatcher("/Usuario.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if (validarUsuario(usuario, password)) {

            response.sendRedirect("RegistrarProducto.jsp");
        } else {
            response.sendRedirect("Usuario.jsp?error=1");
        }
    }

    private boolean validarUsuario(String usuario, String password) {
        return "deous7v".equals(usuario) && "desey2005".equals(password);
    } 
  }