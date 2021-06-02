package ar.edu.unlam.pb2.parcial1.dominio;

public class Libro extends Producto{

	private String autor;
	private String editorial;
	
	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor=autor;
		this.editorial=editorial;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

}
