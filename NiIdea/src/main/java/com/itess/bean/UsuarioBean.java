package com.itess.bean;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class UsuarioBean implements Serializable{
    private String nombre = "Juan Manuel Rosales Contreras";
    private String mensaje = "Bienvenido a tu portafolio de logros en programación.";

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void enviar() {
        System.out.println("Mensaje enviado por: " + nombre);
    }
}
