package com.example.miproyecto.service;

import com.example.miproyecto.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioDTO> findAll();

    UsuarioDTO save(UsuarioDTO usuarioDTO);

    //Optional<UsuarioDTO> findById(Long id);

    //void update(long id, UsuarioDTO usuarioDTO);

    //void deleteById(long id);
}
