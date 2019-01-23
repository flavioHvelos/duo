package com.luizalabs.duo.service.contract;

import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepResponse;

public interface DadosCepServiceImpl {

	DtoConsultaDadosCepResponse consultaCep(DtoConsultaDadosCepRequest dto);
	
}
