package com.example.miproyecto.service.impl;

import com.example.miproyecto.dto.UsuarioDTO;
import com.example.miproyecto.entity.Usuario;
import com.example.miproyecto.mapper.UsuarioMapper;
import com.example.miproyecto.repository.UsuarioRepository;
import com.example.miproyecto.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioMapper usuarioMapper;
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioMapper usuarioMapper, UsuarioRepository usuarioRepository) {
        this.usuarioMapper = usuarioMapper;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();

        //return usuarios.stream().map(usuarioMapper::toUsuarioDTO).toList();

        List<UsuarioDTO> usuariosDTO = new LinkedList<>();
        for(Usuario usuario : usuarios){
            usuariosDTO.add(usuarioMapper.toUsuarioDTO(usuario));
        }

        return usuariosDTO;

    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        UsuarioDTO usuarioDTODTO = usuarioMapper.toUsuarioDTO(usuario);

        return usuarioDTODTO;
    }
}
