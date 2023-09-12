package com.unal.tripster_user_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{nombre}")
    public Usuario obtenerUsuarioPorNombre(@PathVariable String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable String email, @RequestBody Usuario usuario) {
        usuario.setEmail(email);
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void borrarUsuario(@PathVariable String id) {
        usuarioRepository.deleteById(id);
    }
}

