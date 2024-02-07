package com.desafiobackendjr.desafio.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiobackendjr.desafio.entities.Veiculo;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

	@GetMapping
	public ResponseEntity<Veiculo> findAll(){
		Veiculo v = new Veiculo(null, "José da Silva", "203.397.390-53", "ABC1234");
		return ResponseEntity.ok().body(v);
	}
}
