package com.latam.alura.tienda.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import com.latam.alura.tienda.modelo.Producto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class ProductoDao {
	
	private EntityManager em;
	
	public ProductoDao(EntityManager em) {
		this.em = em;
	}

	public void guardar(Producto producto) {
		this.em.persist(producto);
	}
	
	public Producto consultaPorId(Long id) {
		return em.find(Producto.class, id);
	}
	
    public void actualizar(Producto producto) {
        this.em.merge(producto);
    }

    public void remover(Producto producto) {
    	producto=this.em.merge(producto);
        this.em.remove(producto);
    }
    
    // Metodo para consultar todos los elementos de la tabla producto:
    public List<Producto> consultarTodos(){
    	String jqpl = "SELECT P FROM Producto AS P";
    	return em.createQuery(jqpl,Producto.class).getResultList();
    }
    
    public List<Producto> consultarPorNombre(String nombre){
    	String jqpl = "SELECT P FROM Producto AS P WHERE P.nombre = :nombre";
    	return em.createQuery(jqpl,Producto.class).setParameter("nombre", nombre).getResultList();
    }
    
    // En la consulta se debe poner el nombre de la entidad (Producto) y no en el de la tabla:
    public List<Producto> consultarPorNombreCategoria(String nombre){
    	String jqpl = "SELECT P FROM Producto AS P WHERE P.categoria.nombre = :nombre";
    	return em.createQuery(jqpl,Producto.class).setParameter("nombre", nombre).getResultList();
    }
    
    public BigDecimal consultarPrecioPorNombreProducto(String nombre){
    	return em.createNamedQuery("Producto.consultaDePrecio", BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
    }
    
    public List<Producto> consultarPorParametro(String nombre, BigDecimal precio, LocalDate fecha){
    	StringBuilder jpql = new StringBuilder("SELECT P FROM Producto P WHERE 1=1 ");
    	
    		if(nombre!=null && !nombre.trim().isEmpty()) {
    			jpql.append("AND P.nombre = :nombre ");
    		}
    		if(precio!=null && !precio.equals(new BigDecimal(0))) {
    			jpql.append("AND P.precio = :precio ");
    		}
    		if(fecha!=null) {
    			jpql.append("AND P.fechaDeRegistro = :fecha ");
    		}   		
    		
    		TypedQuery<Producto> query = em.createQuery(jpql.toString(),Producto.class);

    		if(nombre!=null && !nombre.trim().isEmpty()) {
    			query.setParameter("nombre", nombre);
    		}
    		if(precio!=null && !precio.equals(new BigDecimal(0))) {
    			query.setParameter("precio", precio);
    		}
    		if(fecha!=null) {
    			query.setParameter("fecha", fecha);
    		} 
    		
    		return query.getResultList();
    }
    
    public List<Producto> consultarPorParametroConAPICriteria(String nombre, BigDecimal precio, LocalDate fecha){
    	CriteriaBuilder builder = em.getCriteriaBuilder();
    	CriteriaQuery<Producto> query = builder.createQuery(Producto.class);
    	Root<Producto> from = query.from(Producto.class);
    	
    	javax.persistence.criteria.Predicate filtro = builder.and();
		if(nombre!=null && !nombre.trim().isEmpty()) {
			filtro=builder.and(filtro,builder.equal(from.get("nombre"), nombre));
		}
		if(precio!=null && !precio.equals(new BigDecimal(0))) {
			filtro=builder.and(filtro,builder.equal(from.get("precio"), precio));
		}
		if(fecha!=null) {
			filtro=builder.and(filtro,builder.equal(from.get("fechaDeRegistro"), fecha));
		}   		
    		
		query = query.where(filtro);
		return em.createQuery(query).getResultList();
    		
    }
      
}



