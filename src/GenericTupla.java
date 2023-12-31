
public class GenericTupla<V,E> {

	private V value1;
	
	private E value2;
	
	GenericTupla(V v1, E v2) {
		this.setValue1(v1);
		this.setValue2(v2);
	}

	public V getValue1() {
		return value1;
	}

	public E getValue2() {
		return value2;
	}

	public void setValue1(V value1) {
		this.value1 = value1;
	}

	public void setValue2(E value2) {
		this.value2 = value2;
	}
	
}
