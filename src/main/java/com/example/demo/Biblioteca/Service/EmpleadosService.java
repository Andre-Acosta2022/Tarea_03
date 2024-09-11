package com.example.demo.Biblioteca.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Biblioteca.Entity.Empleados;

public interface EmpleadosService {
	Empleados create (Empleados emp);
	Empleados update (Empleados emp);
	void delete(long id);
	Optional<Empleados>read(long id );
	List<Empleados>readAll();
}
