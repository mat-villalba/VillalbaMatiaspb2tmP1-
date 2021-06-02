package ar.edu.unlam.pb2.parcial1.dominio;

public class Libro extends Producto implements Vendible{

	private String autor;
	private String editorial;
	private Double precioDeVenta;
	
	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor=autor;
		this.editorial=editorial;
		this.precioDeVenta=0.00;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioDeVenta=pRECIO_VENTA;
		
	}

	@Override
	public Double getPrecioVenta() {
		return precioDeVenta;
	}

}
