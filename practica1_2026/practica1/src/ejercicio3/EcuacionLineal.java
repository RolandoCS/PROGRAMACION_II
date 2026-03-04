package ejercicio3;
import java.util.Scanner;
public class EcuacionLineal {
	private double a;//a) atributos privados a,b,c
	private double b;
	private double c;
	public EcuacionLineal(double a1, double b1, double c1) {//b) constructor para a,b,c
		a = a1;
		b = b1;
		c = c1;
	}
	public double getDiscriminante() { //c) metodo getDiscriminante()
		double disc;
		disc = (Math.pow(b, 2)) - 4 * a * c;
		if (disc > 0) {
			System.out.println("la discriminante es: " + disc);
			return disc;
		} else if (disc == 0) {
			System.out.println("la discriminante es: " + disc);
			return 1;
		} else {
			System.out.println("la discriminante es: " + disc);
			return 0;
		}
	}
	//d) metodos getRaiz1() y getRaiz2()
	public double getRaiz1() {
		double r1;
		r1 = (-b + Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / 2 * a;
		return r1;
	}
	public double getRaiz2() {
		double r2;
		r2 = (-b - Math.sqrt((Math.pow(b, 2)) - 4 * a * c)) / 2 * a;
		return r2;
	}
}





