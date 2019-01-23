package com.luizalabs.duo.service.contract.dto.DtoDadosCep;

public class DtoConsultaDadosCepRequest {

	public DtoConsultaDadosCepRequest(long cep) {
		this.cep =  cep;
	}
	private Long cep;

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

}
