public class GenericTuplaNumerica2<V extends Number,E extends Number> extends GenericTupla<V, E> {

	GenericTuplaNumerica2(V v1, E v2) {
		super(v1, v2);
	}

	public double getSuma() {
		if (this.getValue1() != null) {
			if (this.getValue2() != null) {
				return this.getValue1().doubleValue() + this.getValue2().doubleValue();
			}
		}
		
		return 0.0;
	}
}

