package com.example.demo.Biblioteca.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Biblioteca.Dao.RolDao;
import com.example.demo.Biblioteca.Entity.Rol;
import com.example.demo.Biblioteca.Repository.RolRepository;
@Component
public class RolDaoImpl implements RolDao {
@Autowired
private RolRepository rolRepository;

@Override
public Rol create(Rol r) {
	// TODO Auto-generated method stub
	return rolRepository.save(r) ;
}

@Override
public Rol update(Rol r) {
	// TODO Auto-generated method stub
	return rolRepository.save(r);
}

@Override
public void delete(long id) {
	// TODO Auto-generated method stub
	rolRepository.deleteById(id);
}

@Override
public Optional<Rol> read(long id) {
	// TODO Auto-generated method stub
	return rolRepository.findById(id);
}

@Override
public List<Rol> readAll() {
	// TODO Auto-generated method stub
	return rolRepository.findAll();
}

}
