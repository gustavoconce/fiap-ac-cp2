package br.com.fiap.ecommerce.model;

import java.math.BigDecimal;
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
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_pedido", nullable = false)
    private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_produto", nullable = false)
    private Produto produto;

    @Column(precision = 16, scale = 2, nullable = false)
    private BigDecimal quantidade;

    @Column(precision = 16, scale = 2, nullable = false)
    private BigDecimal valorTotal;
}
