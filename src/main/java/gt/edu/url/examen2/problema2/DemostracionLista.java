package gt.edu.url.examen2.problema2;

public class DemostracionLista implements DemoList {

	@Override
	/**
	 * genera un demo de array list con cierr=tos valores prueba
	 */
	public List<Integer> crearDemoLista() {

		ArrayList<Integer> lista=new  ArrayList<Integer>();
		 
		 lista.add(0, 4);
		 
		 lista.add(0, 3);
		 
		 lista.add(0, 2);
		 
		 lista.add(2, 1);
		 
		 lista.add(1, 5);
		 
		 lista.add(1, 6);
		 
		 lista.add(3, 7);
		 
		 lista.add(0, 8);
		 
		 
		 return lista;
	}

}
