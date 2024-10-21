package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente", nullable = false)
    private Cliente cliente;
    
	@Column(nullable = false)
    private LocalDate dataPedido;
	
	@Column(nullable = false, length = 30)
    private String status;
	
	@Column(nullable = false, length = 50)
    private String formaPagamento;
	
	@Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal valorTotal;
}
