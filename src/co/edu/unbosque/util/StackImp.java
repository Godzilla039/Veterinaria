package co.edu.unbosque.util;

public class StackImp<T> implements Stack<T>{

	private DequeList<T> infos = new DequeList<T>();
	
	public StackImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(T info) {
		infos.insertFirst(info);
	}

	@Override
	public T pop() {
		
		return infos.removeFirts();
	}

	@Override
	public int size() {
		
		return infos.getSize();
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
		sb.append("Top[");
		DNode<T> aux = this.infos.getHead();
		for (int i = 0; i < this.infos.getSize(); i++) {
			sb.append(aux.getInfo());
			if(aux == this.infos.getTail()) {
				break;
			}
			sb.append("-");
			aux = aux.getNext();
		}
		sb.append("] Bottom");
		return sb.toString();
		
	}
	
	
	
}
