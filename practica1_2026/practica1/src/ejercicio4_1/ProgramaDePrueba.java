package ejercicio4_1;
import java.util.Scanner;
public class ProgramaDePrueba {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("calcular el promedio y desviacion");
		Estadistica e1 =new Estadistica();
		e1.promedio();
		e1.desviacion();
	}
}
