package com.desafiobackendjr.desafio.DTO;

public class VeiculoDTO {

	private String marca;
	private String modelo;
	private String chassi;
	private String licenciado;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getLicenciado() {
		return licenciado;
	}
	public void setLicenciado(String licenciado) {
		this.licenciado = licenciado;
	}
	
}
/*"id" : 1,
"proprietario" : "José da Silva",
"cpf" : "203.397.390-53",
"placa" : "ABC1234",
"marca": "Chevrolet",
"modelo": "Suburban 1500",
"chassi": "5TDBKRFH2FS979708",
"licenciado": true
*/