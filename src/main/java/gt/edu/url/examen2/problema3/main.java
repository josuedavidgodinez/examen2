package gt.edu.url.examen2.problema3;



import gt.edu.url.examen2.problema2.DemostracionLista;
import gt.edu.url.examen2.problema2.List;
import gt.edu.url.examen2.problema4.LinkedPositionalList;
import gt.edu.url.examen2.problema4.Position;
import gt.edu.url.examen2.problema5.DynamicStack;

public class main {

	public static void main(String[] args) {
		DemostracionLista demo=new DemostracionLista();
	List<Integer> lista=demo.crearDemoLista();
		
		do {
			System.out.println(lista.remove(0));
		}while(!lista.isEmpty());
	
		 
		 
		
	}

}
