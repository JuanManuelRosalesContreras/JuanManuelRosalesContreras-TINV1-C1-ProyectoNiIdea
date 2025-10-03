package tics.itess.domain;

import java.util.ArrayList;
import java.util.List;

public class FJMP {
    private int id;
    private String nombre;
    private String descripcion;
    private List<String> observaciones;

    // Constructor vacío
    public FJMP() {
        this.observaciones = new ArrayList<>();
    }

    public FJMP(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.observaciones = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<String> getObservaciones() { return observaciones; }
    public void agregarObservacion(String observacion) {
        this.observaciones.add(observacion);
    }
}
