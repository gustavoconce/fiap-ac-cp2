package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;
import lombok.Data;

@Data
public class ItemPedidoRequestCreateDto {

	private Pedido pedido;
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorTotal;
}
