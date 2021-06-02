package ar.edu.unlam.pb2.parcial1.dominio;

public class Producto {

	Integer codigo;
	String descripcion;
	
	public Producto(Integer codigo, String descripcion) {
		this.codigo=codigo;
		this.descripcion=descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
