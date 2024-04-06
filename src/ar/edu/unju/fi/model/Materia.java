package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombre;
	
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}


	public String getCodigo() {
		return codigo;
	}

	

	@Override
	public String toString() {
		return "Materia - Codigo: " + codigo + ", Nombre: " + nombre;
	}


	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
