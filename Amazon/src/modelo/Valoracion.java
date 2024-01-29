package modelo;

import java.time.LocalDate;

public class Valoracion {
	private int valor;
	private LocalDate fecha;
	private Usuario usuario;
	
	private static final int VALORACION_MAXIMA=5;
	private static final int VALORACION_MINIMA=1;
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Valoracion(int valor, LocalDate fecha) {
		super();
		this.valor = valor;
		this.fecha = fecha;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		if (valor>=VALORACION_MINIMA&&valor<=VALORACION_MAXIMA) {
			this.valor = valor;
		}
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Valoracion [valor=" + valor + ", fecha=" + fecha + ", usuario=" + usuario + "]";
	}
	
}
