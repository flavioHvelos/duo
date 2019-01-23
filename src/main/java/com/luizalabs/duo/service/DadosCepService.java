package com.luizalabs.duo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.luizalabs.duo.clone.domain.CadCep;
import com.luizalabs.duo.clone.repo.CepCloneRepository;
import com.luizalabs.duo.root.repo.CepRootRepository;
import com.luizalabs.duo.service.contract.DadosCepServiceImpl;
import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosCep.DtoConsultaDadosCepResponse;

@ComponentScan(basePackages = { "com.luizalabs.duo" })
@Service
public class DadosCepService implements DadosCepServiceImpl{
	  

	
	  @Autowired
	  private  CepRootRepository rootRepo;
	  @Autowired
	  private CepCloneRepository cloneRepo;

	  
	public DtoConsultaDadosCepResponse consultaCep(DtoConsultaDadosCepRequest dto) {
		
		DtoConsultaDadosCepResponse response = new DtoConsultaDadosCepResponse();

		if(dto == null) {
			response.addError(null);
			return response;
		}
		
		if (dto.getCep() <= 0) {
			response.addError(null);
			return response;
		}	
		
		try {
			
			  List<com.luizalabs.duo.root.domain.CadCep> root = rootRepo.findOneByCep(dto.getCep());
			  CadCep clone = new CadCep();	

			  FieldCopyUtil.setFields(root.get(0), clone);
			  
			  cloneRepo.save(clone);
			
			if(root.isEmpty()) {
				response.addError(null);
				return response;
			}
				
			response.setCep(root.get(0).getCep());
			response.setUf(root.get(0).getUf());
			response.setLocal(root.get(0).getLocal());
			response.setBairro(root.get(0).getBairro());
			response.setLogradouro(root.get(0).getLogradouro());
			response.setEndereco(root.get(0).getEndereco());
			response.setDe((root.get(0)).getDe());
			response.setAte(root.get(0).getAte());
			response.setFl_par_impar(root.get(0).getFl_par_impar());
			
			

									
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);		
			return response;
		}
					
		return response;
	
		
	}

	
}
