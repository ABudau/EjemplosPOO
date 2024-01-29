package modelo;

public class Usuario {
	private String nombre;

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}



	public String getNombre() {
		return nombre;
	}

	

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
