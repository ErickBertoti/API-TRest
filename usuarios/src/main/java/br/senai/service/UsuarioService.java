package br.senai.service;
import br.senai.model.Usuario;
import java.util.List;


public interface UsuarioService {

    public List<Usuario> findAll();
    public Usuario findById(long id);
    public Usuario create(Usuario usuario);
    public Usuario update(Usuario usuario, long id);
    
    public void delete(long id);


}