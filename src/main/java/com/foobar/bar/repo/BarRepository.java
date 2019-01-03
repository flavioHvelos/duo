package com.foobar.bar.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.bar.domain.CadCep;

@Repository
public interface BarRepository extends JpaRepository<CadCep, Long> {

	public List<CadCep> findOneByCep(Long cep);

}
