package co.edu.unbosque.util;

import java.time.temporal.Temporal;

/**
 * @author deste
 *
 * @param <T>
 */
public class DequeList<T> extends MyDoubleLinkedList<T> implements Deque<T> {

	private DNode<T> tail;
	private int size;
	
	public DequeList() {
		head = new DNode<T>();
		tail = new DNode<T>();
		head.setNext(tail);
		tail.setPrevious(head);
		size = 0;
		//tail es la cola, y la cabeza siempre le va a apuntar si se le pide el dato anterior.
	}

	@Override
	public void insertLast(T info) {
		DNode<T> t = this.tail;
		DNode<T> temporaly = new DNode<T>();
		temporaly.setInfo(info);
		temporaly.setPrevious(t);
		t.setNext(temporaly);
		this.tail = temporaly;
		if(size == 0) {
			head = temporaly;//puso head pero no sé si se equivocó porque segun mi logica ahi va tail = temporaly.
		}
		size++;
	}

	@Override
	public T removeLast() {
		if(tail == null) {
			return null;
		}else {
			T value = tail.getInfo();
			tail = tail.getPrevious();
			size--;
			return value;
		}		
	}

	@Override
	public void insertFirst(T info) {

		DNode<T> h = this.head;
		DNode<T> temporaly = new DNode<T>();
		temporaly.setInfo(info);
		temporaly.setNext(h);
		h.setPrevious(temporaly);
		this.head = temporaly;
		if (size == 0) {
			tail = temporaly;
		}
		size++;
		
	}

	@Override
	public T removeFirts() {
		if(head == null) {
			return null;
		}
		T value = this.head.getInfo();
		head = head.getNext();
		size--;
		
		return value;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public DNode<T> getTail() {
		return tail;
	}

	public void setTail(DNode<T> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append("head[");
		DNode<T> aux = head;
		for (int i = 0; i < size; i++) {
			sb.append(aux.getInfo());
			if(aux == tail) {
				break;
			}
			sb.append("-");
			aux = aux.getNext();
		}
		sb.append("] tail");
		return sb.toString();	
	}	
}
