package gt.edu.url.examen2.problema4;

import gt.edu.url.examen2.problema4.LinkedPositionalList;
import gt.edu.url.examen2.problema4.Position;

public class main {

	public static void main(String[] args) {
		LinkedPositionalList<Integer> list=new LinkedPositionalList<Integer> ();
		Position<Integer> rojo=list.addFirst(23);
		Position<Integer> verde=list.addFirst(2);
		Position<Integer> blanco=list.addFirst(12);
		Position<Integer> dorado=list.addFirst(0);
		Position<Integer> amarillo=list.addFirst(96);
	
		
		if(list.positionAtIndex(1)==dorado) {
			
			System.out.println("si funciona");
		}else {
			
			System.out.println("no funciona");
		}
		


	
	}

}
