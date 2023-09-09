package co.edu.unbosque.util;

public interface Deque <T>{
	public void insertLast(T info);
	public T removeLast();//trae el ultimo dato, muestra y borra
	public void insertFirst(T info);
	public T removeFirts();
	public int size();
}
