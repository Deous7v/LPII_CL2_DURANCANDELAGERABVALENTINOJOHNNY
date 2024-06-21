package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IProductos;
import Modelo.TBL_PRODUCTOCL2;

public class TBL_PRODUCTOCL2Imp implements IProductos {
    private EntityManagerFactory emf;
    private EntityManager em;

    public TBL_PRODUCTOCL2Imp() {
        this.emf = Persistence.createEntityManagerFactory("LPII_CL2_DURANCANDELAGERABVALENTINOJOHNNY");
        this.em = emf.createEntityManager();
    }

    @Override
    public void RegistrarProducto(TBL_PRODUCTOCL2 producto) {
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
            System.out.println("Producto registrado en la base de datos");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void ActualizarProducto(TBL_PRODUCTOCL2 producto) {
        // Implementación
    }

    @Override
    public void EliminarProducto(TBL_PRODUCTOCL2 producto) {
        // Implementación
    }

    @Override
    public TBL_PRODUCTOCL2 BuscarProducto(TBL_PRODUCTOCL2 producto) {
        // Implementación
        return null;
    }

    @Override
    public List<TBL_PRODUCTOCL2> ListarProducto() {
        List<TBL_PRODUCTOCL2> listadoproducto = null;
        try {
            em.getTransaction().begin();
            listadoproducto = em.createQuery("selec c from TBL_PRODUCTOCL2 c", TBL_PRODUCTOCL2.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return listadoproducto;
    }
    
    // Cerrar el EntityManager cuando no se necesite más
    public void close() {
        if (em.isOpen()) {
            em.close();
        }
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
