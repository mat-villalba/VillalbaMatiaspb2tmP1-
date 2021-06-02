package ar.edu.unlam.pb2.parcial1.dominio;

public class Cliente {

	private Integer codigoDeCliente;
	private String apellido;
	private String nombre;
	private Integer edad;
	
	public Cliente(Integer codigoDeCliente, String apellido, String nombre, Integer edad) {
		this.codigoDeCliente=codigoDeCliente;
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
	}

	public Integer getCodigo() {
		return codigoDeCliente;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}
	
	

}
