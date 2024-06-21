package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TBL_PRODUCTOCL2Imp;
import Modelo.TBL_PRODUCTOCL2;



/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TBL_PRODUCTOCL2 	producto=new TBL_PRODUCTOCL2();
		TBL_PRODUCTOCL2Imp crud=new TBL_PRODUCTOCL2Imp();
		List<TBL_PRODUCTOCL2> listadoproducto=crud.ListarProducto();
	
for(TBL_PRODUCTOCL2 lis:listadoproducto){
			
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIDPRODUCTOCL2()+
					" Nombre "+lis.getNOMBRECL2()+" Precio Compra "+lis.getPRECIOCOMPCL2()+" Precio venta "+lis.getPRECIOVENTACL2()+" Estado "+lis.getESTADOCL2()+" descripcion "+lis.getDESCRIPCL2());
			
		}
		
		
		request.setAttribute("listadoproductos",listadoproducto);	
		//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
	   //redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//recuperamos los datos del formulario
				String nombre=request.getParameter("NOMBRECL2");
				String precioVentaStr = request.getParameter("PRECIOVENTACL2");
				String precioCompStr = request.getParameter("PRECIOCOMPCL2");
				String estado=request.getParameter("ESTADOCL2");
				String descripcion=request.getParameter("DESCRIPCL2");
				try {
				double precioven = Double.parseDouble(precioVentaStr);
				double preciocomp = Double.parseDouble(precioCompStr);
				} catch (NumberFormatException e) {
					 e.printStackTrace();
					 response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error: Los campos de precio no son válidos");
				}
				//instanciamos las respectivas clases...
				TBL_PRODUCTOCL2 producto=new TBL_PRODUCTOCL2();
				TBL_PRODUCTOCL2Imp crud=new TBL_PRODUCTOCL2Imp();
				
				producto.setNOMBRECL2(nombre);
				producto.setPRECIOVENTACL2(0);
				producto.setPRECIOCOMPCL2(0);
				producto.setESTADOCL2(estado);
				producto.setDESCRIPCL2(descripcion);

				//invocamos el metodo a registrar cliente en la bd
				crud.RegistrarProducto(producto);
				
				//actualizar el listado
				List<TBL_PRODUCTOCL2> listadoproducto=crud.ListarProducto();
				//asignamo el listado de clientes recuperados de la BD.
			     request.setAttribute("listadoproductos",listadoproducto);
				request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	
	}

}
