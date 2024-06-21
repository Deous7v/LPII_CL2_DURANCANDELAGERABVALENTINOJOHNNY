package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IUsuario;
import Modelo.TBL_USUARIOCL2;

public class TBL_USUARIOCL2Imp implements IUsuario {
    private EntityManagerFactory emf;
    private EntityManager em;

    public TBL_USUARIOCL2Imp() {
        this.emf = Persistence.createEntityManagerFactory("LPII_CL2_DURANCANDELAGERABVALENTINOJOHNNY");
        this.em = emf.createEntityManager();
    }

    @Override
    public void RegistrarUsuario(TBL_USUARIOCL2 usuario) {
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            System.out.println("Usuario registrado en la base de datos");
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void ActualizarUsuario(TBL_USUARIOCL2 usuario) {
        // Implementación
    }

    @Override
    public void EliminarUsuario(TBL_USUARIOCL2 usuario) {
        // Implementación
    }

    @Override
    public TBL_USUARIOCL2 BuscarUsuario(TBL_USUARIOCL2 usuario) {
        // Implementación
        return null;
    }

    @Override
    public List<TBL_USUARIOCL2> ListarUsuario() {

      return null;
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
