package ar.edu.unlam.pb2.parcial1.dominio;

public class Videoclub {

	private String nombre;
	private Producto[] productos;
	private final Integer CANTIDAD_MAXIMA_DE_PRODUCTOS;
	
	public Videoclub(String nombre) {
		this.nombre=nombre;
		this.CANTIDAD_MAXIMA_DE_PRODUCTOS=100;
		this.productos= new Producto[CANTIDAD_MAXIMA_DE_PRODUCTOS];
	}

	public Boolean agregarProducto(Producto nuevoProducto) {
		for(int i=0; i<productos.length; i++) {
			productos[i] = nuevoProducto;
			return true;
		}
		return false;
	}

	public Boolean buscarProducto(Producto productoBuscado) {
		for(Producto actual : productos) {
			if(actual.equals(productoBuscado)) {
				return true;
			}
		}
		return false;
	}
	
}
