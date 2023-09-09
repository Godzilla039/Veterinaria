package co.edu.unbosque.util;

public class DNode <T> {
	
	private DNode<T> next;
	private T info;
	private DNode<T> previous;
	
	public DNode() {
		// TODO Auto-generated constructor stub
	}
	public DNode(T info) {
		this.next = next;
		this.info = info;
		this.previous = previous;
	}

	public DNode(DNode<T> next, T info, DNode<T> previous) {
		super();
		this.next = next;
		this.info = info;
		this.previous = previous;
	}
	public DNode<T> getNext() {
		return next;
	}
	public void setNext(DNode<T> next) {
		this.next = next;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public DNode<T> getPrevious() {
		return previous;
	}
	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}
	@Override
	public String toString() {
		return "DNode [next=" + next + ", info=" + info + ", previous=" + previous + "]";
	}
	
	

	
}
