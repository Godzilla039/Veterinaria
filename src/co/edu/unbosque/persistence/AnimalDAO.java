package co.edu.unbosque.persistence;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.util.QueueImp;
import co.edu.unbosque.util.StackImp;

public class AnimalDAO {

	private AnimalDTO adto;
	private StackImp<Long> cobijas;
	private QueueImp<AnimalDTO> animales;

	public AnimalDAO() {

		adto = new AnimalDTO();
		animales = new QueueImp<AnimalDTO>();
		cobijas = new StackImp<Long>();
	}

	public AnimalDTO getAdto() {
		return adto;
	}

	public void setAdto(AnimalDTO adto) {
		this.adto = adto;
	}

	public StackImp<Long> getCobijas() {
		return cobijas;
	}

	public void setCobijas(StackImp<Long> cobijas) {
		this.cobijas = cobijas;
	}

	public QueueImp<AnimalDTO> getAnimales() {
		return animales;
	}

	public void setAnimales(QueueImp<AnimalDTO> animales) {
		this.animales = animales;
	}

	public String ingresarCobija(int cobija) {

		String salida = "";
		for (int i = 1; i <= cobija; i++) {
			cobijas.push(((long) i));
		}
		salida = "Se agregaron las cobijas...";
		return salida;
	}

	public String ingresarAnimal(String especie, String nombre) {

		String salida = "";
		animales.enQueue(new AnimalDTO(especie, nombre));
		salida = "Se agrego la mascota correctamente";

		return salida;
	}

	public String atender() {

		String salida = "";
		cobijas.pop();
		animales.dequeue();
		salida = "Se atendio la mascota";

		return salida;
	}

	public String contadorCobijas() {
		String salida = "";
		int cont = 0;
		for (int i = 0; i < cobijas.size(); i++) {
			cont++;
		}
		salida = "\nHay " + cont + " cobijas en la canasta: ";
		return salida;
	}

	public String mostrarCobijas() {

		String salida = "";

		for (int i = 0; i < cobijas.size(); i++) {

		}
		salida += cobijas.toString();
		return salida;
	}

	public String mostrarAnimales() {

		String salida = "";

		for (int i = 0; i < animales.size(); i++) {

		}
		salida += animales.toString();
		return salida;
	}

}
