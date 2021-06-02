package ar.edu.unlam.pb2.parcial1.dominio;

public class Cliente {

	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	
	public Cliente(Integer codigo, String apellido, String nombre, Integer edad) {
		this.codigo=codigo;
		this.apellido=apellido;
		this.nombre=nombre;
		this.edad=edad;
	}

	public Integer getCodigo() {
		return codigo;
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
