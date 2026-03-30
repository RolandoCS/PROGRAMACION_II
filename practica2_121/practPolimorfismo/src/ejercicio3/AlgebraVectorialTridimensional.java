package ejercicio3;
import java.util.Scanner;
public class AlgebraVectorialTridimensional {
	Scanner sc=new Scanner(System.in);
	private double x;
	private double y;
	private double z;
	private double longitud;
	public void llenarVector() {
		System.out.print("llene el componente x: ");
		x=sc.nextDouble();
		System.out.print("llene el componente y: ");
		y=sc.nextDouble();
		System.out.print("llene el componente z: ");
		z=sc.nextDouble();
	}
	public void algebra1(AlgebraVectorialTridimensional b){
		double x;
		double y;
		double z;
		x=this.x+b.x;
		y=this.y+b.y;
		z=this.z+b.z;
		System.out.println("la suma es: "+"("+x+","+y+","+z+")");
	}
	public void algebra1() {
		double x;
		double y;
		double z;
		double r;
		System.out.print("ingrese un escalar r: ");
		r=sc.nextDouble();
		x=r*this.x;
		y=r*this.y;
		z=r*this.z;
		System.out.println("la multiplicacion del vector A con el escalar r:"+r+"; es igual a: "+"("+x+","+y+","+z+")");
	}
	public void algebra1(String p) {
		longitud=(Math.pow(this.x, 2))+(Math.pow(this.y, 2))+(Math.pow(this.z, 2));
		longitud=Math.sqrt(longitud);
		System.out.println("la longitud del vector A es: "+longitud);
	}
	public void algebra2() {
		double x;
		double y;
		double z;
		x=this.x/longitud;
		y=this.y/longitud;
		z=this.z/longitud;
		System.out.println("la normal del vector A es: "+"("+x+","+y+","+z+")");
	}
	public void algebra2(AlgebraVectorialTridimensional b) {
		double prod;
		prod=((this.x)*(b.x))+((this.y)*(b.y))+((this.z)*(b.z));
		System.out.println("el producto escalar de los vectores A y B es: "+prod);
	}
	public void algebra2(AlgebraVectorialTridimensional b, String a) {
		double x;
		double y;
		double z;
		x=((this.y)*(b.z))-((this.z)*(b.y));
		y=((this.z)*(b.x))-((this.x)*(b.z));
		z=((this.x)*(b.y))-((this.y)*(b.x));
		System.out.println("el producto cruz de los vectores A y B es: "+"("+x+","+y+","+z+")");
	}
}
