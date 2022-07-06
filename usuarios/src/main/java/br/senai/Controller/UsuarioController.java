package br.senai.Controller;

import br.senai.model.Usuario;
import br.senai.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> findById(@PathVariable long id) {
        return Optional.ofNullable(usuarioService.findById(id));
    }

    @PostMapping("/usuario")
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);

    }

}








