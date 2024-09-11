package com.example.demo.Biblioteca.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.Biblioteca.Entity.Usuario;

public interface UsuarioDao {
	Usuario create (Usuario us);
	Usuario update (Usuario us);
	void delete(long id);
	Optional<Usuario>read(long id );
	List<Usuario>readAll();
}
