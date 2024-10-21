package br.com.fiap.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.fiap.ecommerce.model.Cliente;
import lombok.Data;

@Data
public class PedidoRequestCreateDto {
	
    private Cliente cliente;
    private LocalDate dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;   
}
