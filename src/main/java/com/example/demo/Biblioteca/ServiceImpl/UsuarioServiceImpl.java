package com.example.demo.Biblioteca.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Biblioteca.Dao.UsuarioDao;
import com.example.demo.Biblioteca.Entity.Usuario;
import com.example.demo.Biblioteca.Service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
private UsuarioDao usuarioDao;

@Override
public Usuario create(Usuario us) {
	// TODO Auto-generated method stub
	return usuarioDao.create(us);
}

@Override
public Usuario update(Usuario us) {
	// TODO Auto-generated method stub
	return usuarioDao.update(us);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	usuarioDao.delete(id);
}

@Override
public Optional<Usuario> read(long id) {
	// TODO Auto-generated method stub
	return usuarioDao.read(id);
}

@Override
public List<Usuario> readAll() {
	// TODO Auto-generated method stub
	return usuarioDao.readAll();
}


}
