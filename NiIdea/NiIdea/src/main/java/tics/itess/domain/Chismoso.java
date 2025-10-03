package tics.itess.domain;
import java.util.ArrayList;
import java.util.List;

public class Chismoso {
    private int id;
    private String nombre;
    private String parentesco; // papá, mamá, hermano, tutor legal
    private String telefono;
    private String correo;
    private List<String> comentarios; // comentarios que da sobre el alumno

    // Constructor vacío
    public Chismoso() {
        this.comentarios = new ArrayList<>();
    }

    // Constructor con parámetros
    public Chismoso(int id, String nombre, String parentesco, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.telefono = telefono;
        this.correo = correo;
        this.comentarios = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public List<String> getComentarios() { return comentarios; }
    public void agregarComentario(String comentario) {
        this.comentarios.add(comentario);
    }

}
