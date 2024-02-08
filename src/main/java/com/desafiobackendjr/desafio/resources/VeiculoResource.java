package com.desafiobackendjr.desafio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiobackendjr.desafio.DTO.VeiculoDTO;
import com.desafiobackendjr.desafio.entities.Payload;
import com.desafiobackendjr.desafio.entities.Veiculo;
import com.desafiobackendjr.desafio.services.VeiculoService;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;
	
	private VeiculoDTO veiculoDTO = new VeiculoDTO();
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> findAll(){
		List<Veiculo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("{veiculo}")
	public VeiculoDTO consultaVeiculo(){
		return service.consultaVeiculo();
	}
	
	@PostMapping
	public ResponseEntity<Veiculo> insert(@RequestBody Veiculo obj){
		
		veiculoDTO = service.consultaVeiculo();
		obj.setChassi(veiculoDTO.getChassi());
		obj.setMarca(veiculoDTO.getMarca());
		obj.setModelo(veiculoDTO.getModelo());
		obj.setLicenciado(veiculoDTO.getLicenciado());
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
}
