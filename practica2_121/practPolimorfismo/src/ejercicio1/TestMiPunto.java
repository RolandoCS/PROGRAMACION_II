package ejercicio1;
public class TestMiPunto {
	public static void main(String[] args) {
		MiPunto p1 = new MiPunto();          // (0,0)
		MiPunto p2 = new MiPunto(10, 30.5);  // (10,30.5)
	    double distancia = p1.distancia(p2);
	    double distancia2 = p1.distancia(10, 30.5);
	    System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
	    System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
	    System.out.println("Distancia entre los puntos: " + distancia);
	    System.out.println("Distancia entre los puntos: " + distancia2);
	}
}




