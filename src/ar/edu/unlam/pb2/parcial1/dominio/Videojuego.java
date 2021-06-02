package ar.edu.unlam.pb2.parcial1.dominio;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Clasificacion;
import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto implements Alquilable{

	private TipoDeConsola tipo;
	private Double precioDeAlquiler;
	private Clasificacion clasificacion;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		super(codigo, descripcion);
		this.tipo=tipo;
		this.precioDeAlquiler=0.00;
		this.clasificacion=Clasificacion.MAYORESDE18;
	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.precioDeAlquiler=pRECIO_ALQUILER;
	}

	@Override
	public Double getPrecioAlquiler() {
		return precioDeAlquiler;
	}

	@Override
	public void setCalificacion(Clasificacion nuevaClasificacion) {
		this.clasificacion=nuevaClasificacion;
		
	}

	@Override
	public Clasificacion getClasificacion() {
		return clasificacion;
	}

}
