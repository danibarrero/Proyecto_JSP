package org.iesvdm.proyecto_jsp.model;

import java.util.Objects;

public class Usuario {

    private int usuarioID;
    private String name;
    private String password;

    public Usuario() {
    }

    public Usuario(int usuarioID, String name, String password) {
        this.usuarioID = usuarioID;
        this.name = name;
        this.password = password;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;
        return usuarioID == usuario.usuarioID && Objects.equals(name, usuario.name) && Objects.equals(password, usuario.password);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
