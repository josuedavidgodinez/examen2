package gt.edu.url.examen2.problema2;

public class main {

	public static void main(String[] args) {
		DemostracionLista demo=new DemostracionLista();
		List<Integer> lista=demo.crearDemoLista();
		do {
			System.out.println(lista.remove(0));
			
		}while(!lista.isEmpty());
		
	}

}
