package com.luizalabs.duo.root.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luizalabs.duo.root.domain.CadCep;

@Repository
public interface CepRootRepository extends JpaRepository<CadCep, Long> {

	public List<CadCep> findOneByCep(Long cep);
}
