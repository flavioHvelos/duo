package com.foobar.foo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.CadCep;

@Repository
public interface FooRepository extends JpaRepository<CadCep, Long> {

	public List<CadCep> findOneByCep(Long cep);
}
