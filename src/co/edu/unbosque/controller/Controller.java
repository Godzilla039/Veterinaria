package co.edu.unbosque.controller;

import co.edu.unbosque.persistence.AnimalDAO;
import co.edu.unbosque.view.Console;

public class Controller {

	private Console c;
	private AnimalDAO adao;

	public Controller() {

		c = new Console();
		adao = new AnimalDAO();
	}

	public void run() {

		ciclo1: while (true) {

			c.imprimirConSalto("-------------------------------------------------------------");
			c.imprimirConSalto("---VETERINARIA BELLAKA---");
			c.imprimirConSalto("\n1. Ingrese cobijas (OJO IMPORTANTE HACERLO PRIMERO!).");
			c.imprimirConSalto("2. Ingrese mascota.");
			c.imprimirConSalto("3. Atender mascota.");
			c.imprimirConSalto("4. Mostrar mascotas.");
			c.imprimirConSalto("5. Mostrar cobijas disponibles.");
			c.imprimirConSalto("6. Salir");
			c.imprimirConSalto("-------------------------------------------------------------");

			ciclo2: while (true) {

				int op = c.readInt();
				switch (op) {
				case 1:
					c.imprimirConSalto("---NÚMERO DE TOALLAS---");
					c.imprimirConSalto("Ingrese numero de toallas: ");
					int cobija = c.leerEntero();
					c.imprimirConSalto(adao.ingresarCobija(cobija));
					break ciclo2;

				case 2:

					c.imprimirConSalto("---INGRESE MASCOTA---");
					c.imprimirConSalto("Ingrese la especie: ");
					String especie = c.leerCadena();
					c.imprimirConSalto("Ingrese el nombre: ");
					String nombre = c.leerCadena();
					c.imprimirConSalto(adao.ingresarAnimal(especie, nombre));
					break ciclo2;

				case 3:
					
					if (adao.getCobijas().size() == 0) {
						c.imprimirConSaltoRed("No hay cobijas disponbibles...");
						break ciclo2;
						
					} else {
						if(adao.getAnimales().size()==0) {
							c.imprimirConSaltoRed("No hay mascotas por atender");
							break ciclo2; 
							
						}else {
							c.imprimirConSalto("La mascota: ");
							c.imprimirConSalto(adao.atender());
						}
					}
					break ciclo2;
					
				case 4:
					c.imprimirConSalto("---MASCOTAS EN ESPERA---");
					c.imprimirConSalto(adao.mostrarAnimales());
					break ciclo2;

				case 5:
					c.imprimirConSalto("---CANTIDAD DE COBIJAS---");
					c.imprimirConSalto(adao.contadorCobijas());
					c.imprimirConSalto(adao.mostrarCobijas());
					c.imprimirConSalto("¨¨¨¨¨¨");
					break ciclo2;

				case 6:
					c.imprimirConSalto("Adios...");
					c.imprimirConSalto("Gracias por usar el programa :).");
					System.exit(0);
					break ciclo2;

				default:
					c.imprimirConSaltoRed("Opción invalida...");
					c.imprimirConSaltoRed("Intente de nuevo.");
					break ciclo2;
				}
			}

		}
	}

}
