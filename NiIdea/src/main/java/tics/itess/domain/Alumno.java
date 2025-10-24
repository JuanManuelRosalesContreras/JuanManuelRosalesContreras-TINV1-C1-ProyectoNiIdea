/*
* ITESS-TICS TALLER DE INVESTIGACION 1
* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Alumno: datos del alumno.
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 16/10/2025
*/

package tics.itess.domain;

public class Alumno extends Usuario{
    
    private String ndc;
   
    public Alumno(String nombre, String ndu, String clave, String ndc) {
        super(nombre, ndu, clave);
        
        this.ndc = ndc;
    }

    public String getNdc() {
        return ndc;
    }

    public void setNdc(String ndc) {
        this.ndc = ndc;
    }
}
