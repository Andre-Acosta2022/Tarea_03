package com.example.demo.Biblioteca.Dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.Biblioteca.Entity.Empleados;

public interface EmpleadosDao {
Empleados create (Empleados emp);
Empleados update (Empleados emp);
void delete(long id);
Optional<Empleados>read(long id );
List<Empleados>readAll();
}
