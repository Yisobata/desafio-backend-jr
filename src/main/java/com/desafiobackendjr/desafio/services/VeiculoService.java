package com.desafiobackendjr.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafiobackendjr.desafio.DTO.VeiculoDTO;
import com.desafiobackendjr.desafio.entities.Veiculo;
import com.desafiobackendjr.desafio.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;
	
	public List<Veiculo> findAll(){
		return repository.findAll();
	}

	public Veiculo insert(Veiculo veiculo) {
		return repository.save(veiculo);
	}
	
	public VeiculoDTO consultaVeiculo(){
		String url = "https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=ABC1234";
		RestTemplate restTemplate = new RestTemplate();
	
		ResponseEntity<VeiculoDTO> resp = restTemplate.getForEntity(url, VeiculoDTO.class);
		return resp.getBody();
	}
}
