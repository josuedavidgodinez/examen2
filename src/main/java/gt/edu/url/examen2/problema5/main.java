package gt.edu.url.examen2.problema5;



import gt.edu.url.examen2.problema4.LinkedPositionalList;
import gt.edu.url.examen2.problema4.Position;

public class main {

	public static void main(String[] args) {
		DynamicStack<Integer> pila=new DynamicStack<Integer>();
		pila.push(21);
		pila.push(23);
		pila.push(0);
		pila.push(3);
		
		do {
			
			System.out.println(pila.pop());
		}while(!pila.isEmpty());
	
		 
		 
		
	}

}
