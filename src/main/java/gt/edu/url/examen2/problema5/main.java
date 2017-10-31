package gt.edu.url.examen2.problema5;

public class main {

	public static void main(String[] args) {
		DynamicStack<Integer> pila=new DynamicStack<Integer> ();
		pila.push(43);
		pila.push(2);
		pila.push(1);
		pila.push(56);
		pila.push(10);
		
		
		System.out.println("tamanio:"+pila.size());
		
		
		
		System.out.println("tope:"+pila.top());
		
		do {
			System.out.println(pila.pop());
			
		}while(!pila.isEmpty());
		
		
	}

}
