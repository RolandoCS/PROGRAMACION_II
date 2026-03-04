package ejercicio2;
import java.util.Scanner;
public class EcuacionLineal {
	private double a;// a) atributos privados
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	double x;
	double y;
	//b) constructor para los atributos
	public EcuacionLineal(double a1, double b1, double c1, double d1, double e1, double f1) {
		a = a1;
		b = b1;
		c = c1;
		d = d1;
		e = e1;
		f = f1;
	}
	public boolean tieneSolucion() {//c) metodo tieneSolucion()
		double aux=(a * d) - (b * c);
		if (aux != 0) {
			x=(e*d - b*f)/(a*d - b*c);
			y=(a*f - e*c)/(a*d - b*c);
			return true;
		}
		else {
			return false;
		}
	}
	//d) metodos getX() y getY()
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}







