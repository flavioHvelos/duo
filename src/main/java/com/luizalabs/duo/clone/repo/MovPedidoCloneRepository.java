package com.luizalabs.duo.clone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luizalabs.duo.clone.domain.MovPedido;
import com.luizalabs.duo.clone.domain.MovPedidoPK;

import java.util.List;


@Repository
public interface MovPedidoCloneRepository extends JpaRepository<MovPedido, MovPedidoPK>{
	
	public List<MovPedido> findOneById_Numpedven(Long numpedven);

}
