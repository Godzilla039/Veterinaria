package co.edu.unbosque.model;

public class AnimalDTO {

	private String especie; 
	private String nombre;
	
	public AnimalDTO() {
	
	}

	public AnimalDTO(String especie, String nombre) {
		super();
		this.especie = especie;
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "AnimalDTO [especie=" + especie + ", nombre=" + nombre + "]";
	}
}
