
public class GenericSample3 {

	public static void main(String[] args) {

		GenericTuplaNumerica2<?,?> tupla = new GenericTuplaNumerica2<>(10L, 20.5);
		
		System.out.println(tupla.getValue1() + " + " + tupla.getValue2() + " = " + tupla.getSuma());
		
	}

}
