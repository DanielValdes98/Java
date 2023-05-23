package com.latam.alura.tienda.dao;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Cliente;

import java.math.BigDecimal;
import java.util.List;

public class ClienteDao {
	
	private EntityManager em;
	
	public ClienteDao(EntityManager em) {
		this.em = em;
	}

	public void guardar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente consultaPorId(Long id) {
		return em.find(Cliente.class, id);
	}
	
    public void actualizar(Cliente cliente) {
        this.em.merge(cliente);
    }

    public void remover(Cliente cliente) {
    	cliente=this.em.merge(cliente);
        this.em.remove(cliente);
    }
    
    // Metodo para consultar todos los elementos de la tabla cliente:
    public List<Cliente> consultarTodos(){
    	String jqpl = "SELECT P FROM Cliente AS P";
    	return em.createQuery(jqpl,Cliente.class).getResultList();
    }
    
    public List<Cliente> consultarPorNombre(String nombre){
    	String jqpl = "SELECT P FROM cliente AS P WHERE P.nombre = :nombre";
    	return em.createQuery(jqpl,Cliente.class).setParameter("nombre", nombre).getResultList();
    }
    
    // En la consulta se debe poner el nombre de la entidad (cliente) y no en el de la tabla:
    public List<Cliente> consultarPorNombreCategoria(String nombre){
    	String jqpl = "SELECT P FROM cliente AS P WHERE P.categoria.nombre = :nombre";
    	return em.createQuery(jqpl,Cliente.class).setParameter("nombre", nombre).getResultList();
    }
    
    public BigDecimal consultarPrecioPorNombrecliente(String nombre){
    	String jqpl = "SELECT P.precio FROM cliente AS P WHERE P.nombre = :nombre";
    	return em.createQuery(jqpl,BigDecimal.class).setParameter("nombre", nombre).getSingleResult();
    }
      
}



