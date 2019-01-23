package com.luizalabs.duo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luizalabs.duo.service.contract.DadosCepServiceImpl;
import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepResponse;
import com.luizalabs.util.spring.ControllerBase;

@RestController
public class BuscaCepController extends ControllerBase{
 
	@Autowired
	private DadosCepServiceImpl service;

  @RequestMapping(value = "/buscaCep", method = RequestMethod.GET)
	public DtoConsultaDadosCepResponse buscaCep(@RequestParam("CEP") Long cep) {
	  
		
		DtoConsultaDadosCepResponse response = new DtoConsultaDadosCepResponse();
	    	
		try {
			response = service.consultaCep(new DtoConsultaDadosCepRequest(cep));
		}
		catch(Exception ex) {
			response.addError(null, "Erro não tratado ao consulta CEP: " + ex);
		}
		  
		return response;	
  }
  
}
