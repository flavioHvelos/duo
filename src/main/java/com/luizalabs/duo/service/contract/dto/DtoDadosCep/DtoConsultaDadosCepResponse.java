package com.luizalabs.duo.service.contract.dto.DtoDadosCep;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.luizalabs.util.spring.DtoResponseBase;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize
public class DtoConsultaDadosCepResponse extends DtoResponseBase {
	
	private Long cep;
	private String uf; //verificar anotation pois é um campo char
	private String local;
	private String bairro;
	private String logradouro; //verificar anotation pois é um campo char
	private String endereco;
	private Long de;
	private Long ate;
	private String fl_par_impar; //verificar anotation pois é um campo char
	private String CountCadCep;
	
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getDe() {
		return de;
	}
	public void setDe(Long de) {
		this.de = de;
	}
	public Long getAte() {
		return ate;
	}
	public void setAte(Long ate) {
		this.ate = ate;
	}
	public String getFl_par_impar() {
		return fl_par_impar;
	}
	public void setFl_par_impar(String fl_par_impar) {
		this.fl_par_impar = fl_par_impar;
	}
	public String getCountCadCep() {
		return CountCadCep;
	}
	public void setCountCadCep(String countCadCep) {
		CountCadCep = countCadCep;
	}
}
