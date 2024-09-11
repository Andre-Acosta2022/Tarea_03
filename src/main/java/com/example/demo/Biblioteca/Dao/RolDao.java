package com.example.demo.Biblioteca.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.Biblioteca.Entity.Rol;

public interface RolDao {
	Rol create (Rol r);
	Rol update (Rol r);
	void delete(long id);
	Optional<Rol>read(long id );
	List<Rol>readAll();
}
