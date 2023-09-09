package co.edu.unbosque.util;

public class QueueImp<T> implements Queue<T>{

	private DequeList<T> infos;
	
	public QueueImp() {
		infos = new DequeList<T>();
		}
	
	@Override
	public void enQueue(T info) {
		infos.insertFirst(info);
		
	}

	@Override
	public T dequeue() {
		return infos.removeLast();
	}

	@Override
	public int size() {

		return infos.size();
	}
	@Override
	public T peek() {
		T temporaly = infos.removeFirts();
		infos.insertFirst(temporaly);
		
		return temporaly;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Back[");
		DNode<T> aux = this.infos.getHead();
		for (int i = 0; i < this.infos.getSize(); i++) {
			sb.append(aux.getInfo());
			if(aux == this.infos.getTail()) {
				break;
			}
			sb.append("-");
			aux = aux.getNext();
		}
		sb.append("] Front");
		return sb.toString();
		
		
	}
	
	

}
