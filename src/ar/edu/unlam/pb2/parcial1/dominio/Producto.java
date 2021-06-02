package ar.edu.unlam.pb2.parcial1.dominio;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Producto {

	private Integer codigo;
	private String descripcion;
	private Estado estado;
	
	
	public Producto(Integer codigo, String descripcion) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.estado= Estado.DISPONIBLE;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Estado getEstadoActual() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cliente getQuienPoseeElProducto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
