package gt.edu.url.examen2.problema3;



import gt.edu.url.examen2.problema3.LinkedPositionalList;

public class main {

	public static void main(String[] args) {
	LinkedPositionalList<Integer> list=new LinkedPositionalList<Integer> ();
	Position<Integer> rojo=list.addFirst(23);
	Position<Integer> verde=list.addFirst(2);
	Position<Integer> blanco=list.addFirst(12);
	Position<Integer> dorado=list.addFirst(0);
	Position<Integer> amarillo=list.addFirst(96);
		
	list.swap(verde,dorado);
		do {
			System.out.println(list.remove(list.first()));
		}while(!list.isEmpty());
	
		 
		 
		
	}

}
