package com.luizalabs.duo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.luizalabs.duo.root.domain.MovPedido;
import com.luizalabs.duo.root.domain.MovPedidoPK;
import com.luizalabs.duo.root.repo.MovPedidoRootRepository;
import com.luizalabs.duo.service.contract.DadosPedidoImpl;
import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoResponse;
import com.luizalabs.util.errors.IErrorLangResult;

@ComponentScan(basePackages = { "com.luizalabs.duo" })
@Service
public class DadosPedidoService implements DadosPedidoImpl{

	
	  @Autowired
	  private  MovPedidoRootRepository rootRepo;
	  
	  public DtoConsultaDadosPedidoResponse consultaPedido(DtoConsultaDadosPedidoRequest dto) {
		  
		  DtoConsultaDadosPedidoResponse response  = new DtoConsultaDadosPedidoResponse();
		  
		  if(dto == null) {
				response.addError(null);
				return response;
			}
		  

		  		  
		  try {


			  List<MovPedido> root = rootRepo.findOneById_Numpedven(dto.getNumpedven());
			  
				if(root.isEmpty()) {
					response.addError(null);
					return response;
				}
				  
				response.setStatus(root.get(0).getStatus());
				response.setSitcarga(root.get(0).getSitcarga());
				response.setCodfil(root.get(0).getId().getCodfil());
				response.setFilorig(root.get(0).getFilorig());
				response.setCodfiltransffat(root.get(0).getCodfiltransffat());
				response.setTipoped(root.get(0).getId().getTipoped());
				response.setCodcli(root.get(0).getCodcli());
				response.setCodclipres(root.get(0).getCodclipres());
				response.setFllibfat(root.get(0).getFllibfat());
				response.setDtpedido(root.get(0).getDtpedido());
				response.setTpnota(root.get(0).getTpnota());
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return response;
		}
		  return response;
	  }
	  
}
