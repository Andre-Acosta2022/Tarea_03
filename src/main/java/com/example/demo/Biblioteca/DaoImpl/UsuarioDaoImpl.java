package com.example.demo.Biblioteca.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Biblioteca.Dao.UsuarioDao;
import com.example.demo.Biblioteca.Entity.Usuario;
import com.example.demo.Biblioteca.Repository.UsuarioRepository;
@Component
public class UsuarioDaoImpl  implements UsuarioDao{
@Autowired
private UsuarioRepository usuarioRepository;

@Override
public Usuario create(Usuario us) {
	// TODO Auto-generated method stub
	return usuarioRepository.save(us);
}

@Override
public Usuario update(Usuario us) {
	// TODO Auto-generated method stub
	return usuarioRepository.save(us);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	usuarioRepository.deleteById(id);
}

@Override
public Optional<Usuario> read(long id) {
	// TODO Auto-generated method stub
	return usuarioRepository.findById(id);
}

@Override
public List<Usuario> readAll() {
	// TODO Auto-generated method stub
	return usuarioRepository.findAll();
}

}
