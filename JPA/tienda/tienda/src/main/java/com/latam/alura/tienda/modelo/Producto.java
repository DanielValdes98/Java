 package com.latam.alura.tienda.modelo;
 

import java.math.BigDecimal;
import java.time.LocalDate;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@SuppressWarnings("all")
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.consultaDePrecio", query="SELECT P.precio FROM Producto AS P WHERE P.nombre = :nombre")
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@Column(name = "nombres") // En caso de que en la BD el nombre de la columna sea diferente
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private LocalDate fechaRegistro = LocalDate.now();
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Categoria categoria; // Muchos productos tienen una unica categoria
	
	public Producto() {}

	public Producto(String nombre, String descripcion, BigDecimal precio, Categoria categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
		

}
























