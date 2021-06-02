package ar.edu.unlam.pb2.parcial1.dominio;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Clasificacion;

public interface Alquilable {

	public void setPrecioAlquiler(Double pRECIO_ALQUILER);

	public Double getPrecioAlquiler();
	
	public Clasificacion getClasificacion();

	public void setCalificacion(Clasificacion nuevaClasificacion);
}
