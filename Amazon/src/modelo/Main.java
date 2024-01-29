package modelo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Usuario usuario1=new Usuario("pepe");
		Usuario usuario2=new Usuario("Maria");
		Usuario usuario3=new Usuario("Luis");
		Producto libro=new Producto(10,"Libro de Psicología");
		Valoracion valoracion1=new Valoracion(5, LocalDate.now());
		valoracion1.setUsuario(usuario1);
		Valoracion valoracion2=new Valoracion(1, LocalDate.now());
		Valoracion valoracion3=new Valoracion(3, LocalDate.now());
		Valoracion valoracion4=new Valoracion(3, LocalDate.now());
		
		valoracion4.setUsuario(usuario2);
		valoracion3.setUsuario(usuario3);
		Valoracion[]valoraciones1=new Valoracion[1000];
		valoraciones1[0]=valoracion1;
		valoraciones1[1]=valoracion2;
		valoraciones1[2]=valoracion3;
		valoraciones1[3]=valoracion4;
		
		libro.setValoraciones(valoraciones1);
		
//		System.out.println(libro.getValoracionMedia());
//		System.out.println(libro.getValoracionMejor());
//		System.out.println(libro.getValoracionesFiltradas(3));
		mostrarValoraciones(3, libro);
	}
	
/**
 * Metodo que muestra un array
 * @param valor
 * @param p
 */
	public static void mostrarValoraciones(int valor,Producto p) {
		for (int i = 0; i <p.getValoracionesFiltradas(valor).length&&p.getValoracionesFiltradas(valor)[i]!=null ; i++) {
//			if (p.getValoracionesFiltradas(valor)[i]!=null) {
				System.out.println(p.getValoracionesFiltradas(valor)[i]);
//			}
			
		}
	}

}
