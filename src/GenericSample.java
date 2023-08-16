import java.util.ArrayList;
import java.util.List;

public class GenericSample {

	public static void main(String[] args) {

		TipoGenerico<Integer> t1 = new TipoGenerico<>(10);
		
		TipoGenerico<?> t2 = new TipoGenerico<>("Hola");
		
		TipoGenerico<TipoGenerico<Integer>> t3 = new TipoGenerico<>(new TipoGenerico<>(20));
		
		List<TipoGenerico<Double>> l = new ArrayList<>();

		l.add(new TipoGenerico<>(10.0));
		l.add(new TipoGenerico<>(30.0));
		l.add(new TipoGenerico<>(50.0));
		
		System.out.println(t1);
		
		System.out.println(t2);
		
		System.out.println(t3);

		for (TipoGenerico<Double> td : l) {
			System.out.println(td);
		}
	}

}
