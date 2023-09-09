package co.edu.unbosque.util;

public interface Stack<T> {

	public void push(T info);
	public T pop();//Scar al final de la cola
	public int size();
	public T peek(); //MOstrar el dato al principio de la cola
}
