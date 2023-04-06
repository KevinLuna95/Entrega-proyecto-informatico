package es.ifp.programacion.ejercicio.uf4;

import java.util.Date;

/**
 * Gestion de un proyecto informatico:
 * Se desea implementar una gestión para un proyecto informático. Un proyecto se compone de
 * información de su jefe de proyecto y del cliente del proyecto.
 * 
 * @author kkevi
 *
 */
public class ProyectoPrincipal {
	/**
	 * Main del programa
	 * @param args
	 */
	public static void main(String[] args) {
		//Instanciacion de metodos
		Cliente cliente = new Cliente("Pedro","Gonzalez Perez", "11223344L");
		JefeProyecto jefe = new JefeProyecto("Laura","Salazar Franco", "99887744P",56);
		Proyecto proyecto = new Proyecto("PRO-12","Operacion Caixabank", "Necesitan de un programa que les ayude a gestionar los "
				+ "prestamos de sus clientes", new Date(), cliente, jefe );
		
		//Muestra los datos por consola
		System.out.println(proyecto);
	}

}
