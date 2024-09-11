package com.example.demo.Biblioteca.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Biblioteca.Entity.Empleados;
import com.example.demo.Biblioteca.Entity.Usuario;
import com.example.demo.Biblioteca.Service.UsuarioService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
private UsuarioService service;

@GetMapping
public ResponseEntity<List<Empleados>> readAll() {
	try {
		List<Usuario> lista = service.readAll();
		if (lista.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

@PostMapping
public ResponseEntity<Usuario> createUsuario(@Valid @RequestBody Usuario us) {
	try {
		Usuario usu = service.create(us);
		return new ResponseEntity<>(usu, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

}
