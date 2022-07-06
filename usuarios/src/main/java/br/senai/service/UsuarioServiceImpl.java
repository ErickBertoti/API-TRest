package br.senai.service;

import br.senai.model.Usuario;
import br.senai.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> findAll() {
        return null;
    }
    @Override
    public Usuario findById(long id) {
        return null;
    }
    @Override
    public Usuario create(Usuario usuario) {
        return null;
    }
    @Override
    public Usuario update(Usuario usuario, long id) {
        return null;
    }
    @Override
    public void delete(long id) {
    }
}
