package com.example.miproyecto.controller;

import com.example.miproyecto.entity.Usuario;
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
    public List<Usuario>  findAll() {
        return usuarioService.findAll();
    }

    @PostMapping("/usuario")
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

}
