/*/
* ITESS-TICS TALLER DE INVESTIGACION 1
* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Alumno: datos del alumno.
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 02/10/2025
*/

package tics.itess.domain;

public class Alumno {
   private String NoControl;
   private String nombre;
   
   
    public Alumno() {
        // Constructor vacío (JavaBean)
    }
   
    public Alumno(String NoControl, String nombre) {
        this.NoControl = NoControl;
        this.nombre = nombre;
    }
    
    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String mostrarInfo() {
        return "Alumno: " + nombre + ", No. de control: " + NoControl;
    }
  
}
