package ar.edu.unlam.pb2.parcial1.dominio;

public class Comestible extends Producto implements Vendible{

	private Double precioDeVenta;
	
	public Comestible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.precioDeVenta=0.00;
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
