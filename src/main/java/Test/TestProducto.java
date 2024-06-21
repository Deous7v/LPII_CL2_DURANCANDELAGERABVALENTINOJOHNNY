package Test;

import java.util.List;

import DAO.TBL_PRODUCTOCL2Imp;
import Modelo.TBL_PRODUCTOCL2;


public class TestProducto {

	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TBL_PRODUCTOCL2 producto=new TBL_PRODUCTOCL2();
		TBL_PRODUCTOCL2Imp crud=new TBL_PRODUCTOCL2Imp();
		//insertamos datos
		
		producto.setNOMBRECL2("Alex");
		producto.setPRECIOCOMPCL2(0.0);
		producto.setPRECIOVENTACL2(2.0);
		producto.setDESCRIPCL2("Chevere");
		//invocamos el metodo registrar...
		crud.RegistrarProducto(producto);

		List<TBL_PRODUCTOCL2> listado=crud.ListarProducto();
		//aplicamos un bucle
		for(TBL_PRODUCTOCL2 lis:listado){
			
			//imprimimos por pantalla
			System.out.println("codigo "+lis.getIDPRODUCTOCL2()+
					" Nombre "+lis.getNOMBRECL2()+" Precio Compra "+lis.getPRECIOCOMPCL2()+" Precio venta "+lis.getPRECIOVENTACL2()+" descripcion "+lis.getDESCRIPCL2());
			
		}    //fin del bucle for...
		

	}//fin del metodo principal...

}   //fin de la clase...
