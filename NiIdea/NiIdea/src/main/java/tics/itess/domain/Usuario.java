/* Agosto-Diciembre 2025
* Proyecto Nididea
* Clase Usuario: respresenta a una persona que esta usando el sistema (alumno o administrador).
* Docente: FJMP
* Programador: Juan Manuel Rosales Cotreras
* Fecha: 02/10/2025
*/

package tics.itess.domain;

public class Usuario {
    private String username;
    private String password;
    private String rol; // "alumno" o "administrador"

    public Usuario() { }

    public Usuario(String username, String password, String rol) {
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Nota: en un sistema real no almacenamos contraseñas en texto plano
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
