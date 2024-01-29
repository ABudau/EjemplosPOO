package modelo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Usuario usuario1=new Usuario("pepe");
		Usuario usuario2=new Usuario("Maria");
		Usuario usuario3=new Usuario("Luis");
		Producto libro=new Producto(10,"Libro de Psicología");
		Valoracion valoracion1=null;//ew Valoracion(5, LocalDate.now());
//		valoracion1.setUsuario(usuario1);
		Valoracion valoracion2=new Valoracion(1, LocalDate.now());
		Valoracion valoracion3=new Valoracion(3, LocalDate.now());
		Valoracion valoracion4=new Valoracion(3, LocalDate.now());
		Valoracion valoracion5=new Valoracion(3, LocalDate.now());
		
		valoracion4.setUsuario(usuario2);
		valoracion3.setUsuario(usuario3);
		Valoracion[]valoraciones1=new Valoracion[1000];
		valoraciones1[0]=valoracion1;
		valoraciones1[1]=valoracion2;
		valoraciones1[2]=valoracion3;
		valoraciones1[3]=valoracion4;
		valoraciones1[4]=valoracion5;
		
		libro.setValoraciones(valoraciones1);
		
//		System.out.println(libro.getValoracionMedia());
//		System.out.println(libro.getValoracionMejor());
//		System.out.println(libro.getValoracionesFiltradas(3));
		mostrarValoraciones(3, libro);
	}
	
/**
 * Metodo que muestra un array mediante la ejecución de un bucle.
 * El bucle termina cuando se llegue al final de la extensión del array
 * o el valor de la posicion es null
 * @param valor es el valor de la valoracion a buscar dentro del array valoraciones
 * @param p es el producto del que queremos ver las valoraciones
 */
	public static void mostrarValoraciones(int valor,Producto p) {
		for (int i = 0; i <p.getValoracionesFiltradas(valor).length; i++) {
			if (p.getValoracionesFiltradas(valor)[i]!=null) {
				System.out.println(p.getValoracionesFiltradas(valor)[i]);//muestro las valoraciones
			}
			
		}
	}

}
