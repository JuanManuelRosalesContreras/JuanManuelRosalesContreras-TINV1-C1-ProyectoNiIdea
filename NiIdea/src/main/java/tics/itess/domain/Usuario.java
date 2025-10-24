/* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Usuario: respresenta a una persona que esta usando el sistema (alumno o administrador).
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 02/10/2025
*/

package tics.itess.domain;

abstract class Usuario {
    private String nombre;
    private String ndu;
    private String clave;

    public Usuario(String nombre, String ndu, String clave) {
        this.nombre = nombre;
        this.ndu = ndu;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNdu() {
        return ndu;
    }

    public void setNdu(String ndu) {
        this.ndu = ndu;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
