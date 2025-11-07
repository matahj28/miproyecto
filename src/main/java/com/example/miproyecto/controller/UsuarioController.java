package com.example.miproyecto.controller;

import com.example.miproyecto.dto.UsuarioDTO;
import com.example.miproyecto.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuario")
    public List<UsuarioDTO>  findAll() {
        return usuarioService.findAll();
    }

    @PostMapping("/usuario")
    public UsuarioDTO create(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.save(usuarioDTO);
    }
}
