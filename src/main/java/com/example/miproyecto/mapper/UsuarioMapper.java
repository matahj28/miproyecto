package com.example.miproyecto.mapper;

import com.example.miproyecto.dto.UsuarioDTO;
import com.example.miproyecto.entity.Usuario;

public interface UsuarioMapper {

    UsuarioDTO toUsuarioDTO(Usuario usuario);

    Usuario toUsuario(UsuarioDTO usuarioDTO);

}
