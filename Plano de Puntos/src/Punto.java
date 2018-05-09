
public class Punto <T1 extends Number,T2 extends Number> {
	// T1 y T2 son de tipo genericos//
	private T1 x;
	private T2 y;
	
	public Punto (T1 x, T2 y) {
		this.setX(x);
		this.setY(y);
	}
	
	public T1 getX() {
		return x;
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public T2 getY() {
		return y;
	}
	public void setY(T2 y) {
		this.y = y;
	}
	
}
