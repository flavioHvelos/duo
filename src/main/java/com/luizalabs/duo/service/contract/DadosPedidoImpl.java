package com.luizalabs.duo.service.contract;

import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoRequest;
import com.luizalabs.duo.service.contract.dto.DtoDadosPedido.DtoConsultaDadosPedidoResponse;

public interface DadosPedidoImpl {

	DtoConsultaDadosPedidoResponse consultaPedido(DtoConsultaDadosPedidoRequest dto);
}
