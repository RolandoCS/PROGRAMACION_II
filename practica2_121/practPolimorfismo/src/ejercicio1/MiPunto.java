package ejercicio1;
public class MiPunto {
	private double x;
	private double y;
	public double getX() {// a
		return x;
	}
	public double getY() {// a
		return y;
	}
	public MiPunto() {// b
		this.x = 0;
		this.y = 0;
	}
	public MiPunto(double x, double y) {// c
		this.x = x;
		this.y = y;
	}
	// d) Distancia a otro objeto MiPunto
	public double distancia(MiPunto p) {
		double dx = p.x - this.x;
		double dy = p.y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	// e) Distancia a coordenadas dadas
	public double distancia(double x, double y) {
		double dx = x - this.x;
		double dy = y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
