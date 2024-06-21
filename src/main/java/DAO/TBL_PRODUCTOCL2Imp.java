package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductos;
import Modelo.TBL_PRODUCTOCL2;

public class TBL_PRODUCTOCL2Imp implements IProductos{
	  private EntityManager em;

	    public TBL_PRODUCTOCL2Imp() {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_DURANCANDELAGERABVALENTINOJOHNNY");
	        this.em = emf.createEntityManager();
	    }
	@Override
	public void RegistrarProducto(TBL_PRODUCTOCL2 producto) {
		// TODO Auto-generated method stub
		//establecemo conexion con la unidad de persistencia...
				EntityManagerFactory fabri=Persistence.createEntityManagerFactory("LPII_CL2_DURANCANDELAGERABVALENTINOJOHNNY");
				//permite gestionar entidades..
				EntityManager eman=fabri.createEntityManager();
				//iniciar transaccion...
				eman.getTransaction().begin();
				//registramos
				eman.persist(producto);
				//emitimos mensaje por pantalla
				System.out.println("Producto registrado en la base de datos");
				//confirmamos
				eman.getTransaction().commit();
				//cerramos la transaccion...
				eman.close();
	}

	@Override
	public void ActualizarProducto(TBL_PRODUCTOCL2 producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(TBL_PRODUCTOCL2 producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TBL_PRODUCTOCL2 BuscarProducto(TBL_PRODUCTOCL2 producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TBL_PRODUCTOCL2> ListarProducto() {
		// TODO Auto-generated method stub
		//establecemos la conexion con la unidad de persistencia..
				EntityManagerFactory fab=Persistence.createEntityManagerFactory("LPII_CL2_DURANCANDELAGERABVALENTINOJOHNNY");
				//gestionamos las entidades
				EntityManager  em=fab.createEntityManager();
				//iniciamos la transaccion
				em.getTransaction().begin();
				//recuperamos la data de la base de datos
				List<TBL_PRODUCTOCL2> listado=em.createQuery("select c from TBL_PRODUCTOCL2 c",TBL_PRODUCTOCL2.class).getResultList();
				//confirmamos la transaccion
				em.getTransaction().commit();
				//cerramos
				em.close();
				//retornamos el listado
				return listado;
	}

}
