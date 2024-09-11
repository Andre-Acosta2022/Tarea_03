package com.example.demo.Biblioteca.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Biblioteca.Entity.Rol;

public interface RolService {
	Rol create (Rol r);
	Rol update (Rol r);
	void delete(long id);
	Optional<Rol>read(long id );
	List<Rol>readAll();
}
