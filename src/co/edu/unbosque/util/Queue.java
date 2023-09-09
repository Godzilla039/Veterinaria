package co.edu.unbosque.util;

public interface Queue <T>{

	public void enQueue(T info);//Insertar en la tabla.
	public T dequeue();//Sacar de la cola.
	public int size();
	public T peek();//Mostrar el dato al principio de la cola
}
//todas las interfaces van en la carpeta util
