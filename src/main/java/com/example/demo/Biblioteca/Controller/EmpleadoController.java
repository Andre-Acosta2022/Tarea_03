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
import com.example.demo.Biblioteca.Service.EmpleadosService;

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
@RequestMapping("/api/empleados")
public class EmpleadoController {
private EmpleadosService service;

@GetMapping
public ResponseEntity<List<Empleados>> readAll() {
	try {
		List<Empleados> lista = service.readAll();
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
public ResponseEntity<Empleados> createEmpleado(@Valid @RequestBody Empleados em) {
	try {
		Empleados emple = service.create(em);
		return new ResponseEntity<>(emple, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}


}
