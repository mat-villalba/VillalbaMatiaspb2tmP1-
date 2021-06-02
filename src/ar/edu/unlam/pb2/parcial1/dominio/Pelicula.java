package ar.edu.unlam.pb2.parcial1.dominio;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Clasificacion;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto implements Vendible, Alquilable{
	
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private Actor[] actores;
	private Integer cantidadDeActores;
	private Double precioDeVenta;
	private Double precioDeAlquiler;
	private Clasificacion clasificacion;
	
	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anoDeEstreno=anoDeEstreno;
		this.director=director;
		this.cantidadDeActores=10;
		this.actores= new Actor[cantidadDeActores];
		this.precioDeVenta=0.00;
		this.precioDeAlquiler=0.00;
		this.clasificacion=Clasificacion.MAYORESDE18;
		
	}

	public Boolean agregarActor(String nombre) {
		Actor actor = new Actor(nombre);
		for(int i=0; i<actores.length; i++) {
			actores[i] = actor;
			return true;
		}
		return false;
	}

	public Genero getGenero() {
		return genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public Actor[] getActores() {
		return actores;
	}

	public Integer getCantidadDeActores() {
		return cantidadDeActores;
	}

	public Boolean actua(String nombre) {
		if(agregarActor(nombre)) {
			return true;
		}
		return false;
	}

	@Override
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioDeVenta=pRECIO_VENTA;
	}

	@Override
	public Double getPrecioVenta() {
		return precioDeVenta;
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
