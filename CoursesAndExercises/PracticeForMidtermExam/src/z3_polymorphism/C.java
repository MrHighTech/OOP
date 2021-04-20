package z3_polymorphism;

public class C extends B {
	private int w = 0;

	public C() {
	}

	public C(int x, int y, int z, int w) {
		super(x, y, z);
		this.w = w;
	}

	public String toString() {
		return super.toString() + " w=" + w;
	}
}
