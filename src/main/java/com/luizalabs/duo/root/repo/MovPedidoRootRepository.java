package com.luizalabs.duo.root.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luizalabs.duo.root.domain.MovPedido;

@Repository
public interface MovPedidoRootRepository extends JpaRepository<MovPedido, Long>{
	
	public List<MovPedido> findOneById_Numpedven(Long numpedven);

}
