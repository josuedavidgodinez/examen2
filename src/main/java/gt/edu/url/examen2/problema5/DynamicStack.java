package gt.edu.url.examen2.problema5;

public class DynamicStack<E>  implements Stack<E>{


	
	ArrayList<E> lista =new ArrayList<E>();
	

/**
 * obtiene el tamanio del dynamic stack
 */
	public int size() {
		return lista.size();
	}

/**
 * obtiene true si la stack esta vacia de lo contrariob retorna un false
 */
	public boolean isEmpty() {
		return lista.isEmpty();
	}

/**
 * inserta datos en la stack
 */
	public void push(E e) {
		lista.add(0, e);
		
	}

	@Override
	/**
	 * agarra el contenido del tope de la stack
	 */
	public E top() {
		return lista.get(0);
		
	}

	@Override
	/**
	 * remueve el tope del stack y devuelve su contenido
	 */
	public E pop() {
		return lista.remove(0);
	}

}
