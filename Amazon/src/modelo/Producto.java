package modelo;

import java.util.Arrays;
import java.util.Iterator;

public class Producto {
	private String nombre;
	private double precio;
	private Valoracion []valoraciones;
	
	
	
	public Producto( double precio,String nombre) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Valoracion[] getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Valoracion[] valoraciones) {
		this.valoraciones = valoraciones;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Método que calcula la valoración media de un artículo
	 * @return devuelve el calculo de la media de la valoración
	 */
	public double getValoracionMedia() {
		double media=0;
		int contador=0;
		for (int i = 0; i < valoraciones.length; i++) {//declaro un bucle que recorra las posiciones del array
			if (getValoraciones()[i]!=null) {//compruebo que la posición del array contenga una valoracion
				media+=getValoraciones()[i].getValor();//si la tiene, accedo al valor y la sumo a la media
				contador++;//aumento el contador
			}
			
		}
		return media/contador;//devuelvo la media dividida entre el contador
		}
	
	
	/**
	 * Método que devuelve la valoración con el valor más alto
	 * @return devuelve la valoracion más alta.(Devuelve un objeto)
	 */
	public Valoracion getValoracionMejor() {
		Valoracion valoracionMayor=new Valoracion(0, null);//Declaro e inicializo con valores una instancia
															//de la clase valoracion cuyo valor es 0 y la fecha null
		for (Valoracion valoracion : valoraciones) {//recorro todas las posiciones del array valoraciones
			if (valoracion!=null) {//si la valoracion es distinta de null
				if (valoracion.getValor()>valoracionMayor.getValor()) {//compruebo que el valor del objeto de la posición que recorre el bucle
																		//sea mayor que el valor de mi objeto
					valoracionMayor=valoracion;//si es mayor, le asigno a valoracionMayor la dirección de memoria de valoración
				}
			}
		}
		return valoracionMayor;//devuelvo la valoración con más alta
	}
	
	/**
	 * Método que devuelve un array con las valoraciones cuyo valor coincida con el valor que se le pase
	 * por parámetro
	 * @param valor es el valor que se comprueba dentro del array
	 * @return devuelve un array con las valoraciones cuyo valor couincida con el valor del parámetro
	 */
	
	public Valoracion[]getValoracionesFiltradas(int valor){
		Valoracion []valoraciones = new Valoracion[getValoraciones().length];//creo un array auxiliar con la extensión del array que contiene las valoraciones
		int j=0;//declaro un contador
		for (int i = 0; i < valoraciones.length; i++) {//declaro un bucle para recorrer las posiciones del array.
			if (getValoraciones()[i]!=null) {//si las posiciones no contienen un valor null(es decir si existe el objeto) 
				if (getValoraciones()[i].getValor()==valor) {//compruebo el valor de la posición
					valoraciones[j]=getValoraciones()[i];//si el valor coincide introduzco en el array auxiliar
														//la valoración y aumento el contador j para pasar a la siguiente posición
					j++;
				}
			}	
		}
		return valoraciones;//devuelvo el array auxiliar con las valoraciones filtradas
	}
	
	

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", valoraciones=" + Arrays.toString(valoraciones)
				+ "]";
	}
	
}
