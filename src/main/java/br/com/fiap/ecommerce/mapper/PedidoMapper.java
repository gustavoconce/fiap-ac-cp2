package br.com.fiap.ecommerce.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.fiap.ecommerce.dtos.PedidoRequestCreateDto;
import br.com.fiap.ecommerce.dtos.PedidoRequestUpdateDto;
import br.com.fiap.ecommerce.dtos.PedidoResponseDto;
import br.com.fiap.ecommerce.model.Pedido;

@Component
public class PedidoMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public PedidoResponseDto toDto(Pedido pedido) {
        return modelMapper.map(pedido, PedidoResponseDto.class);
    }

    public Pedido toModel(PedidoRequestCreateDto dto) {
        return modelMapper.map(dto, Pedido.class);
    }

    public Pedido toModel(Long id, PedidoRequestUpdateDto dto) {
        Pedido pedido = modelMapper.map(dto, Pedido.class);
        pedido.setId(id);
        return pedido;
    }
	
}
