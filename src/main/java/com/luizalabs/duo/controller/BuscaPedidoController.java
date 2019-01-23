package com.luizalabs.duo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luizalabs.duo.service.contract.DadosPedidoImpl;
import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoResponse;
import com.luizalabs.util.errors.IErrorLangResult;
import com.luizalabs.util.spring.ControllerBase;

@RestController
public class BuscaPedidoController extends ControllerBase{

	@Autowired
	private DadosPedidoImpl service;
	
	  @RequestMapping(value = "/buscaPedido", method = RequestMethod.GET)
	  public DtoConsultaDadosPedidoResponse buscaPedido(@RequestParam("NUMPEDVEN") Long numpedven) {
		  
		  DtoConsultaDadosPedidoResponse response = new DtoConsultaDadosPedidoResponse();
		  
		  try {
			  response = service.consultaPedido(new DtoConsultaDadosPedidoRequest(numpedven));
		} catch (Exception e) {
			// TODO: handle exception
			response.addError((IErrorLangResult) e);
		}
		  
			return response;
	  }
}
