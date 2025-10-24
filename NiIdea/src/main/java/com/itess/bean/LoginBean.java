/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itess.bean;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class LoginBean implements Serializable{
    
    private String usuario;
    private String contrasena;
    private boolean autenticado = false;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public String login() {
        if ("juan".equals(usuario) && "1234".equals(contrasena)) {
            autenticado = true;
            return "index.xhtml?faces-redirect=true";
        } else {
            return "login.xhtml?error=true";
        }
    }

    public String logout() {
        autenticado = false;
        return "login.xhtml?faces-redirect=true";
    }
}
