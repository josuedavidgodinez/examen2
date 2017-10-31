package gt.edu.url.examen2.problema3;

public class LinkedPositionalList<E> implements PositionalList<E> {

/**
 * 
 * @author godin
 *
 * @param <E>
 */
	private static class Node<E> implements Position<E> {
		private E element;
		private Node<E> prev;// Anterior
		private Node<E> next;// Siguiente

		/**
		 * contructor de la clase nodo
		 * @param e valor del nodo
		 * @param p nodo previo
		 * @param n nodo siguiente
		 */
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		/**
		 * Toma un elemnto del nodo
		 */
		public E getElement() throws IllegalStateException {
			if (next == null) // Nodo no valido
				throw new IllegalStateException("Posicion invalida");
			return element;
		}
		
		/**
		 * establce un dato del nodo
		 * @param e
		 */
		public void setElement(E e) {
			element = e;
		}

		/**
		 * obtiene el previo del nodo
		 * @return
		 */
		public Node<E> getPrev() {
			return prev;
		}
/**
 * establece el previo del nodo
 * @param prev
 */
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		/**
		 * obtiene el siguiente del nodo 
		 * @return
		 */
		public Node<E> getNext() {
			return next;
		}

		/**
		 * establece el nodo siguiente del nodo
		 * @param next
		 */
		public void setNext(Node<E> next) {
			this.next = next;
		}

	}
	
	private Node<E> header = null;// Referencia
	private Node<E> trailer = null;
	private int size = 0;

	/**
	 * constructor de lista posicional enlazada 
	 */
	public LinkedPositionalList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	
	/**
	 * hace un safe cast de un objeto posicion a un objeto nodo
	 * @param p
	 * @return
	 * @throws IllegalArgumentException
	 */
	private Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node))
			throw new IllegalArgumentException("P invalido");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getNext() == null)
			throw new IllegalArgumentException("p ya no se encuentra en la lista");
		return node;
	}
	
	/**
	 * Constructor de clase posicion
	 * @param node
	 * @return
	 */
	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
			return null; // do not expose user to the sentinels
		return node;
	}
	@Override
	/**
	 * devuelve el tamanio de la lista
	 */
	public int size() {
	return size;
	}

	@Override
	/**
	 * retorna true de la lista esta vacia de lo contrario retorna false
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	/**
	 * devuelve la primera  posicion de la lista
	 */
	public Position<E> first() {
		return position(header.getNext());
	}

	@Override
	/**
	 * devuelve la ultima  posicion de la lista
	 */
	public Position<E> last() {
		return position(trailer.getPrev());
	}

	@Override
	/**
	 * aniade un elemento en la primera posicion
	 */
	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext());
	}

	@Override
	/**
	 *  aniade un elemento en la ultima posicion
	 */
	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev(), trailer);
	}

	@Override
	/**
	 * aniade una posicion antes de cierta posicion p
	 */
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev());
	}

	@Override
	/**
	 * aniade una posicion despues de cierta posicion p
	 */
	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext());
	}
	
	/**
	 * aniade un dato entre dos nodos pred y succ
	 * @param e
	 * @param pred
	 * @param succ
	 * @return
	 */
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		succ.setPrev(newest);
		pred.setNext(newest);
		size++;
		return newest;
	}

	@Override
	/**
	 * aniade un elemnto antes de cierta posicion p
	 */
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
	}

	@Override
	/**
	 * aniade un elemnto despues de cierta posicion p
	 */
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext());
	}

	@Override
	/**
	 * aniade un elemento e en cierta posicion p
	 */
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;
	}

	@Override
	/**
	 * remueve un elemnto en cierta posicion p
	 */
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}


	@Override
	/**
	 * intercambia dos posiciones p y q
	 */
	public void swap(Position<E> p, Position<E> q) {
	Node<E> aux1=validate(p);
	Node<E> aux2=validate(q);
	E element1=aux1.getElement();	
	E element2=aux2.getElement();	
	
	aux1.setElement(element2);
	aux2.setElement(element1);
	
	}

	

}
