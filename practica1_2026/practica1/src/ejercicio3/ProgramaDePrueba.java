package ejercicio3;
import java.util.Scanner;
public class ProgramaDePrueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a1, b1, c1;
		System.out.print("ingrese valor de a: ");
		a1 = sc.nextDouble();
		System.out.print("ingrese valor de b: ");
		b1 = sc.nextDouble();
		System.out.print("ingrese valor de c: ");
		c1 = sc.nextDouble();
		EcuacionLineal ec = new EcuacionLineal(a1, b1, c1);
		double vDisc = ec.getDiscriminante();
		if (vDisc > 0 && ec.getRaiz1() != ec.getRaiz2()) {
			System.out.println("LA ECUACION TIENE DOS RAICES");
			System.out.println("Raiz 1:  " + ec.getRaiz1());
			System.out.println("Raiz 2:  " + ec.getRaiz2());
		} else {
			if (vDisc == 1) {
				System.out.println("LA ECUACION TIENE UNA RAIZ:  " + ec.getRaiz1());
			} else {
				System.out.println("LA ECUACION NO TIENE RAICES REALES");
			}
		}
	}
}




