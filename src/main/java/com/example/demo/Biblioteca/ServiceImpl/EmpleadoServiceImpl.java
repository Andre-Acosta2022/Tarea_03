package com.example.demo.Biblioteca.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Biblioteca.Dao.EmpleadosDao;
import com.example.demo.Biblioteca.Entity.Empleados;
import com.example.demo.Biblioteca.Service.EmpleadosService;

@Service
public class EmpleadoServiceImpl implements EmpleadosService{
@Autowired
private EmpleadosDao empleadoDao;

@Override
public Empleados create(Empleados emp) {
	// TODO Auto-generated method stub
	return empleadoDao.create(emp);
}

@Override
public Empleados update(Empleados emp) {
	// TODO Auto-generated method stub
	return empleadoDao.update(emp);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	empleadoDao.delete(id);
}

@Override
public Optional<Empleados> read(long id) {
	// TODO Auto-generated method stub
	return empleadoDao.read(id);
}

@Override
public List<Empleados> readAll() {
	// TODO Auto-generated method stub
	return empleadoDao.readAll();
}

}
