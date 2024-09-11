package com.example.demo.Biblioteca.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Biblioteca.Dao.EmpleadosDao;
import com.example.demo.Biblioteca.Entity.Empleados;
import com.example.demo.Biblioteca.Repository.EmpleadosRepository;
@Component
public class EmpleadosDaoImpl  implements EmpleadosDao{
@Autowired
private EmpleadosRepository empleadosRepository;

@Override
public Empleados create(Empleados emp) {
	// TODO Auto-generated method stub
	return empleadosRepository.save(emp);
}

@Override
public Empleados update(Empleados emp) {
	// TODO Auto-generated method stub
	return empleadosRepository.save(emp);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	empleadosRepository.deleteById(id);
}

@Override
public Optional<Empleados> read(long id) {
	// TODO Auto-generated method stub
	return empleadosRepository.findById(id);
}

@Override
public List<Empleados> readAll() {
	// TODO Auto-generated method stub
	return empleadosRepository.findAll();
}

}
