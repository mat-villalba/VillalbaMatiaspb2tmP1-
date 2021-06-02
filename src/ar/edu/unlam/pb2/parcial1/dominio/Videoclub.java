package ar.edu.unlam.pb2.parcial1.dominio;

public class Videoclub {

	private String nombre;
	private Producto[] productos;
	private Cliente[] clientes;
	private final Integer CANTIDAD_MAXIMA_DE_PRODUCTOS;
	private Integer cantidadDeClientes;
	
	public Videoclub(String nombre) {
		this.nombre=nombre;
		this.CANTIDAD_MAXIMA_DE_PRODUCTOS=100;
		this.productos= new Producto[CANTIDAD_MAXIMA_DE_PRODUCTOS];
		this.cantidadDeClientes=10;
		this.clientes= new Cliente[cantidadDeClientes];
	}

	public Boolean agregarProducto(Producto nuevoProducto) {
		for(int i=0; i<productos.length; i++) {
			productos[i] = nuevoProducto;
			return true;
		}
		return false;
	}
	
	public Boolean agregarCliente(Cliente clienteNuevo) {
		for(int i=0; i<clientes.length; i++) {
			clientes[i] = clienteNuevo;
			return true;
		}
		return false;
	}

	public Producto buscarProducto(Producto productoBuscado) {
		for(Producto actual : productos) {
			if(actual.equals(productoBuscado)) {
				return productoBuscado;
			}
		}
		return null;
	}
	
	public Cliente buscarCliente(Cliente clienteBuscado) {
		for(Cliente actual : clientes) {
			if(actual.equals(clienteBuscado)) {
				return clienteBuscado;
			}
		}
		return null;
	}

	public void vender(Producto productoAVender, Cliente comprador) {
		buscarProducto(productoAVender);
		buscarCliente(comprador);
	}
	
}
