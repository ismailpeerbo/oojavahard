public class PointSwapper<Type> {
	private Type a, b;

	public PointSwapper( Type a, Type b ) {
		this.a = a;
		this.b = b;
	}

	public void swap() {
		Type temp = a;
		a = b;
		b = temp;
	}

	public boolean same( Type a1, Type b1 ) {
		System.out.println("a:" + a + " a1:" + a1 + " b:" + b + " b1:" + b1);
		if (a.equals(a1) && b.equals(b1))
			return true;
		return false;
	}

	public Type getFirst() { return a; }
	public Type getLast()  { return b; }

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}
