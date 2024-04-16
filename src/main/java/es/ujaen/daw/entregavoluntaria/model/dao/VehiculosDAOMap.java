package es.ujaen.daw.entregavoluntaria.model.dao;

import es.ujaen.daw.entregavoluntaria.model.Vehiculo;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository("vehiculoDAOMap")
public class VehiculosDAOMap implements VehiculosDAO, Serializable {
    private Map<Integer, Vehiculo> vehiculos = null;
    private  Integer id = 0;
    public VehiculosDAOMap() {
        vehiculos = new HashMap<>();
        //Las matriculas no se corresponden con el año, están pensadas para el ejemplo
        vehiculos.put(id, new Vehiculo(id++,"9985DJR","BMW 530", 120000, "2006", "Bueno"));
        vehiculos.put(id, new Vehiculo(id++,"8123KQR","Mercedes-Benz E-Class", 320000, "1987", "Deteriorado"));
        vehiculos.put(id, new Vehiculo(id++,"6398GBL","Jeep Wrangler", 180000, "2007", "Cuidado"));
    }

    public int numCoches(){
        return vehiculos.size();
    }

    public List<Vehiculo> buscaTodos() {
        return vehiculos.values().stream().collect(Collectors.toList());
    }

    public Vehiculo buscaPorId(Integer id) {
        Vehiculo localizado = vehiculos.get(id);
        if (localizado != null){
            localizado= new Vehiculo(localizado);
        }
        return localizado;
    }

    public boolean borrar(Integer id) {
        boolean result=false;
        if (vehiculos.containsKey(id)) {
            vehiculos.remove(id);
            result = true;
        }
        return result;
    }


    public boolean guarda(Vehiculo vehiculo) {
        boolean result = false;
        if (vehiculos.containsKey(vehiculo.getId())) {
            Vehiculo nuevoVehiculo = new Vehiculo(vehiculo);
            vehiculos.replace(vehiculo.getId(),nuevoVehiculo);
            result = true;
        }
        return result;
    }

    public boolean crea(Vehiculo vehiculo) {
        Vehiculo nuevoVehiculo = new Vehiculo(vehiculo);
        nuevoVehiculo.setId(id);
        vehiculos.put(id, nuevoVehiculo);
        vehiculo.setId(id);
        id++;
        return true;
    }
}
