
public class StackLink<E> implements Stack<E>{
	private Node<E> tope;
	
	public StackLink() {
		this.tope = null;
	}
	
	public void push(E x) {
		this.tope = new Node<E>(x,this.tope);
	}
	public E pop() throws ExceptionIsEmpty {
		// TAREA
		if (isEmpty())
			throw new ExceptionIsEmpty("Esta vacio ...");
		E item = this.tope.getData();
		this.tope = this.tope.getNext();
		return item;
	}
	
	public E top() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Esta vacio ...");
		E item = this.tope.getData();
		return item;
		//return = this.array[this.tope];
	}
	
	public boolean isEmpty () {
		return this.tope == null;
	}
	
	public String toString() {
		// TAREA
		String str = "";
		Node<E> aux = this.tope;
		while (aux != null) {
			str += aux.getData() + ", ";
			aux = aux.getNext();
		}		
		return str;
	}
}
