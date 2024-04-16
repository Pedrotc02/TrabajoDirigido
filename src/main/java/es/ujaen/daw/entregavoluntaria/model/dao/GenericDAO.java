package es.ujaen.daw.entregavoluntaria.model.dao;

import java.util.List;

public interface GenericDAO<T,K> {
    public T buscaPorId(K id);
    public List<T> buscaTodos();
    public boolean crea(T c);
    public boolean guarda(T c);
    public boolean borrar(K id);
}
