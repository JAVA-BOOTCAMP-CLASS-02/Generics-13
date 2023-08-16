public class TipoGenerico<T> {
	
	private final T value;
	
	TipoGenerico(T v) {
		this.value = v;
	}
	
	public T getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.value + " - [" + this.value.getClass().getName() + "]";
	}

}
