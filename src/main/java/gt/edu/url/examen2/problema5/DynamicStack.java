package gt.edu.url.examen2.problema5;

public class DynamicStack<E>  implements Stack<E>{


	
	ArrayList<E> lista =new ArrayList<E>();
	


	public int size() {
		return lista.size();
	}


	public boolean isEmpty() {
		return lista.size()==0;
	}


	public void push(E e) {
		lista.add(0, e);
		
	}

	@Override
	public E top() {
		return lista.get(0);
		
	}

	@Override
	public E pop() {
		return lista.remove(0);
	}

}
