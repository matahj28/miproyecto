package com.example.miproyecto.mapper.impl;

import com.example.miproyecto.dto.UsuarioDTO;
import com.example.miproyecto.entity.Usuario;
import com.example.miproyecto.mapper.UsuarioMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapperImpl implements UsuarioMapper {
    @Override
    public UsuarioDTO toUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        BeanUtils.copyProperties(usuario, usuarioDTO);
        return usuarioDTO;
    }

    @Override
    public Usuario toUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuario);

        //Se debe generar aleatoriamente.
        //Se debe ocultar
        //Se debe hacer que el usuario lo cambie
        usuario.setPassword("00000");

        return usuario;
    }
}
