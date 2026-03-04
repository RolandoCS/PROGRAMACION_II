package ejercicio2;
import java.util.Scanner;
public class ProgramaDePrueba {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		System.out.println("a: ");
		a=sc.nextDouble();
		System.out.println("b: ");
		b=sc.nextDouble();
		System.out.println("c: ");
		c=sc.nextDouble();
		System.out.println("d: ");
		d=sc.nextDouble();
		System.out.println("e: ");
		e=sc.nextDouble();
		System.out.println("f: ");
		f=sc.nextDouble();
		EcuacionLineal l1=new EcuacionLineal(a,b,c,d,e,f);
		System.out.println(l1.tieneSolucion());
		if (l1.tieneSolucion()) {
			System.out.println("x: "+l1.getX());
			System.out.print("y: "+l1.getY());
		}
		else {
			System.out.println("La ecuacion no tiene solucion");
		}
	}
}




