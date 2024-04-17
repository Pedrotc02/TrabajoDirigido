package es.ujaen.daw.entregavoluntaria.model.dao;

import es.ujaen.daw.entregavoluntaria.model.Vehiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Repository("vehiculoDAOJPA")
@Transactional
public class VehiculosDAOJpa implements VehiculosDAO{

    private final Logger logger = Logger.getLogger(VehiculosDAOJpa.class.getName());
    @PersistenceContext //Injected by LocalEntityManagerFactory
    private EntityManager em;

    public VehiculosDAOJpa() {
    }

    @Override
    public Vehiculo buscaPorId(Integer id) {
        Vehiculo vehiculoBuscar = null;
        try{
            vehiculoBuscar = em.find(Vehiculo.class, id);
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return vehiculoBuscar;
    }

    @Override
    public List<Vehiculo> buscaTodos() {
        List<Vehiculo> vehiculos = null;
        try{
            Query q = em.createQuery("Select v from Vehiculo v", Vehiculo.class);
            vehiculos = (List<Vehiculo>)q.getResultList();
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return vehiculos;
    }

    @Override
    public boolean crea(Vehiculo c) {
        boolean creado = false;
        try{
            em.persist(c);
            creado = true;
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return creado;
    }

    @Override
    public boolean guarda(Vehiculo c) {
        boolean guardado = false;
        try{
            c = em.merge(c);
            guardado = true;
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return guardado;
    }

    @Override
    public boolean borrar(Integer id) {
        boolean borrado = false;
        try{
            Vehiculo vehiculoBuscar = null;
            vehiculoBuscar = em.find(Vehiculo.class, id);
            em.remove(vehiculoBuscar);
            borrado = true;
        }catch (Exception ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return borrado;
    }

}
