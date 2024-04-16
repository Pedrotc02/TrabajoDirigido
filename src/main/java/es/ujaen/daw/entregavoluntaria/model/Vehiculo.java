package es.ujaen.daw.entregavoluntaria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "Vehiculos")
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Pattern(regexp = "^\\d{4}[A-Z]{3}$", message = "La matrícula tiene que tener un formato válido (1111XXX)")
    private String matricula;
    private String marca_modelo;
    @Min(value = 0, message = "El kilometraje debe ser mayor o igual a cero")
    private int kilometraje;
    @Pattern(regexp = "^(19[0-9][0-9]|20[0-1][0-9]|202[0-4])$", message = "Introduce un año válido. 1900-2024")
    private String anioMatriculacion;
    private String estado;

    public Vehiculo() {
        id = 0;
        matricula = "";
        marca_modelo = "";
    }

    public Vehiculo(Integer id, String matricula, String marca_modelo, int kilometraje, String anioMatriculacion, String estado) {
        this.id = id;
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.kilometraje = kilometraje;
        this.anioMatriculacion = anioMatriculacion;
        this.estado = estado;
    }

    public Vehiculo(Vehiculo vh) {
        this.id = vh.id;
        this.matricula = vh.matricula;
        this.marca_modelo = vh.marca_modelo;
        this.kilometraje = vh.kilometraje;
        this.anioMatriculacion = vh.anioMatriculacion;
        this.estado = vh.estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(String anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
