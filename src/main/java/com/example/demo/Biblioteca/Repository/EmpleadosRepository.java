package com.example.demo.Biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Biblioteca.Entity.Empleados;

public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {

}
