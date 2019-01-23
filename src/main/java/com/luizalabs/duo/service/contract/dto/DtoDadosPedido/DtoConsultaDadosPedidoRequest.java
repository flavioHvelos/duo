package com.luizalabs.duo.service.contract.dto.DtoDadosPedido;

public class DtoConsultaDadosPedidoRequest {

	public DtoConsultaDadosPedidoRequest(Long numpedven){
		this.numpedven = numpedven;
	}	
	private Long numpedven;
	
	public Long getNumpedven() {
		return numpedven;
	}
	
	public void setNumpedven(Long numpedven) {
		this.numpedven = numpedven;
	}
}
