package com.foobar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.repo.FooRepository;

@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final BarRepository barRepo;

  @Autowired
  FooBarController(FooRepository fooRepo, BarRepository barRepo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
  }

  @RequestMapping("/foobar/{id}")
  public String fooBar(@PathVariable("id") Long id) {
	  List<com.foobar.foo.domain.CadCep> foo = fooRepo.findOneByCep(id);
	  List<com.foobar.bar.domain.CadCep> bar = barRepo.findOneByCep(id);
    

    return foo.get(0).getLocal() + " - " + bar.get(0).getLocal() + "!";
  }

}
