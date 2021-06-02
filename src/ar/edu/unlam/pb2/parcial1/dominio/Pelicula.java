package ar.edu.unlam.pb2.parcial1.dominio;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto{
	
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private Actor[] actores;
	private Integer cantidadDeActores;
	
	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anoDeEstreno=anoDeEstreno;
		this.director=director;
		this.cantidadDeActores=10;
		this.actores= new Actor[cantidadDeActores];
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
	
}
