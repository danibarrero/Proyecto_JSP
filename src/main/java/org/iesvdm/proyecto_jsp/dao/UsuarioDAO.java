package org.iesvdm.proyecto_jsp.dao;

import org.iesvdm.proyecto_jsp.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioDAO {
    public void create(Usuario usuario);

    public List<Usuario> getAll();
    public Optional<Usuario> find(int id);
    public Optional<Usuario> findByName(String name);
    public void update(Usuario usuario);

    public void delete(int id);
}
