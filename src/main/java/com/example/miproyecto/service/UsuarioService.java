package com.example.miproyecto.service;

import com.example.miproyecto.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario save(Usuario usuario);
}
