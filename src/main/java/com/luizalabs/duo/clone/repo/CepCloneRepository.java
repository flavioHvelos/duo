package com.luizalabs.duo.clone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luizalabs.duo.clone.domain.CadCep;

@Repository
public interface CepCloneRepository extends JpaRepository<CadCep, Long> {

	public List<CadCep> findOneByCep(Long cep);

}
