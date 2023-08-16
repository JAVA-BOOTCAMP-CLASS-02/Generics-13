
public class GenericSample4 {
	
	public static <T> T convertir(T origen) {
		if (origen instanceof String) {
			return (T) ((String) origen).toUpperCase();
		}
		return origen;
	}

	public static void main(String[] args) {
		String s1 = "Hola";
		
		System.out.println(convertir(s1));
		System.out.println(convertir(10));
	}

}
