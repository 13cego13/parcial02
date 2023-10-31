package com.example.parcial002.controllers;

import com.example.parcial002.dao.UsuarioDao;
import com.example.parcial002.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usuariocontroller {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("lucas");
        usuario.setApellido("gomez");
        usuario.setEmail("vamos@gmail.com");
        usuario.setTelefono("32144823793");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
       return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario1231")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("lucas");
        usuario.setApellido("gomez");
        usuario.setEmail("vamos@gmail.com");
        usuario.setTelefono("32144823793");
        return usuario;
    }

    @RequestMapping(value = "usuario12321")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("lucas");
        usuario.setApellido("gomez");
        usuario.setEmail("vamos@gmail.com");
        usuario.setTelefono("32144823793");
        return usuario;
    }


    @RequestMapping(value = "usuario1321")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("lucas");
        usuario.setApellido("gomez");
        usuario.setEmail("vamos@gmail.com");
        usuario.setTelefono("32144823793");
        return usuario;
    }
}
