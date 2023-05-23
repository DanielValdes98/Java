package com.latam.alura.tienda.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items_pedido")
public class ItemsPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int cantidad;
	private BigDecimal precioUnitario;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Producto producto;
	@ManyToOne(fetch=FetchType.LAZY)
	private Pedido pedido; // Se conecta con la lista items de la clase pedido
	
	// A un item_pedido se le puede relacionar 1 producto y 1 pedido:
	// itempedido 1 -> producto 1 -> Pedido 2
	// itempedido 2 -> producto 2 -> Pedido 2
	// itempedido 3 -> producto 1 -> Pedido 1
	// itempedido 4 -> producto 3 -> Pedido 1
	
	public ItemsPedido(int cantidad, Producto producto, Pedido pedido) {
		this.cantidad = cantidad;
		this.producto = producto;
		this.pedido = pedido;
		this.precioUnitario = producto.getPrecio();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getValor() {
		return this.precioUnitario.multiply(new BigDecimal(this.cantidad));
	}	

}
