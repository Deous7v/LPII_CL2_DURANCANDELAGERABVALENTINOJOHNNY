package Interfaces;

import java.util.List;

import Modelo.TBL_PRODUCTOCL2;

public interface IProductos {
	public void RegistrarProducto(TBL_PRODUCTOCL2 producto);
	public void ActualizarProducto(TBL_PRODUCTOCL2 producto);
	public void EliminarProducto(TBL_PRODUCTOCL2 producto);
	public TBL_PRODUCTOCL2 BuscarProducto(TBL_PRODUCTOCL2 producto);
	public List<TBL_PRODUCTOCL2> ListarProducto();
}
