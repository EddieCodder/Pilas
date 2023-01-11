
public class StackArray<E> implements Stack<E>{
	private int tope;
	private E[] array;
	
	public StackArray(int n) {
		this.array = (E[]) new Object[n];
		this.tope = -1;
	}
	
	public void push(E x) {
		if (this.tope < this.array.length-1)
			this.array[++this.tope] = x; //Primero incrementamos y luego usamos
		else
			System.out.println("stack está lleno");
	}
	
	public E pop() throws ExceptionIsEmpty {
		//TAREA
		if (isEmpty())
			throw new ExceptionIsEmpty("Esta vacio ...");
		E item = this.array[this.tope];
		this.array[this.tope--] = null; //Primero usamos y luego reducimos el tope
		return item;
	}
	
	public E top() throws ExceptionIsEmpty {
		if (isEmpty())
			throw new ExceptionIsEmpty("Esta vacio ...");
		E item = this.array[this.tope];
		return item;
		//return = this.array[this.tope];
	}
	public boolean isEmpty () {
		return this.tope == -1;
	}
	
	public String toString() {
		String str = "";
		for(int i=0; i<=this.tope; i++) {
			str += this.array[i] + ", ";
		}
		return str;
	}
}
