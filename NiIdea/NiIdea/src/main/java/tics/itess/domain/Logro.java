/*/
* ITESS-TICS TALLER DE INVESTIGACION 1
* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Logro: respresenta una habilidad ya adquirida por un alumno.
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 02/10/2025
*/

package tics.itess.domain;

public class Logro {
    private int id;
    private String tipo;
    private String descripcion;
    private String fecha;
    
    public Logro() { }
    
    public Logro(int id, String tipo, String descripcion, String fecha) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String detalles() {
        return tipo + " - " + descripcion + (fecha != null && !fecha.isEmpty() ? " (Fecha: " + fecha + ")" : "");
    }
}
