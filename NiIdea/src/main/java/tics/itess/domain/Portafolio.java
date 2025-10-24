/*/
* ITESS-TICS TALLER DE INVESTIGACION 1
* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Postafolio: respresenta a un contenedor con todos los logros del alumno.
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 02/10/2025
*/

package tics.itess.domain;

import java.util.ArrayList;
import java.util.List;

public class Portafolio {
    private String titulo;
    private String descripcion;
    private String fechaCreacion;
    private Alumno alumno;
    private List<Logro> logros;

    public Portafolio() {
        this.logros = new ArrayList<>();
    }

    public Portafolio(String titulo, String descripcion, String fechaCreacion, Alumno alumno) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.alumno = alumno;
        this.logros = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Logro> getLogros() {
        return logros;
    }

    public void setLogros(List<Logro> logros) {
        this.logros = logros;
    }

    public void agregarLogro(Logro logro) {
        if (logro != null) this.logros.add(logro);
    }

    public boolean eliminarLogro(Logro logro) {
        return this.logros.remove(logro);
    }

    public String generarResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("Portafolio: ").append(titulo != null ? titulo : "").append("\n");
        sb.append("Alumno: ").append(alumno != null ? alumno.getNombre() : "N/A").append("\n");
        sb.append("Logros (").append(logros.size()).append("):\n");
        for (Logro l : logros) {
            sb.append(" - ").append(l.detalles()).append("\n");
        }
        return sb.toString();
    }
}
