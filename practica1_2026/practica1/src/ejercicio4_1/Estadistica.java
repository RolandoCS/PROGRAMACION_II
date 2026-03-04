package ejercicio4_1;
import java.util.Scanner;
public class Estadistica {
	Scanner sc=new Scanner(System.in);
	double Vector []=new double[10];
	double prom=0;
	double a;
	double b;
	double r=0;
	double sum=0;
	double des=0;
	double pot=0;
	public void promedio() {
		for(int i=0;i<10;i++) {
			System.out.print("ingrese el valor numero "+(i+1)+": ");
			a=sc.nextDouble();
			prom=prom+a;
			Vector[i]=a;
		}
		prom=prom/10;
		System.out.println("el promedio es: "+prom);
	}
	public void desviacion() {
		for(int i=0;i<10;i++) {
			r=Vector[i]-prom;
			pot=Math.pow(r, 2);
			sum=sum+pot;
		}
		des=sum/9;
		des=Math.sqrt(des);
		System.out.println("la desviacion es: "+des);
	}
}
