package Interfaces;

import java.util.List;

import Modelo.TBL_USUARIOCL2;

public interface IUsuario {
	
	public void RegistrarUsuario(TBL_USUARIOCL2 usuario);
	public void ActualizarUsuario(TBL_USUARIOCL2 usuario);
	public void EliminarUsuario(TBL_USUARIOCL2 usuario);
	public TBL_USUARIOCL2 BuscarUsuario(TBL_USUARIOCL2 usuario);
	public List<TBL_USUARIOCL2> ListarUsuario();

}

