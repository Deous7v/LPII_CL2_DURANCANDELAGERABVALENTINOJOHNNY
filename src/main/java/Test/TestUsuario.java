package Test;

import DAO.TBL_USUARIOCL2Imp;
import Modelo.TBL_USUARIOCL2;

public class TestUsuario {

	
	public static void main(String[] args) {
		//realizamos las respectiva instancias..
		TBL_USUARIOCL2 usuario=new TBL_USUARIOCL2();
		TBL_USUARIOCL2Imp crud=new TBL_USUARIOCL2Imp();
		
		usuario.setUSUARIOCL2("administrador");
		usuario.setPASSWORDCL2("deous7v");

		//invocamos el metodo registrar...
		crud.RegistrarUsuario(usuario);
}
}