package ejercicio2;
import java.util.Scanner;
public class AlgebraVectorial {
	Scanner sc=new Scanner(System.in);
	private double x;
	private double y;
	private double z;
	private double suma1;
	private double resta1;
	private double ortogonal;
	private double normaB;
	public void llenarVector() {
		System.out.print("llene el componente x: ");
		x=sc.nextDouble();
		System.out.print("llene el componente y: ");
		y=sc.nextDouble();
		System.out.print("llene el componente z: ");
		z=sc.nextDouble();
	}
	public void Perpendicular(AlgebraVectorial b, String p) {
		double cx=this.x+b.x;
		cx=Math.pow(cx, 2);
		double cy=this.y+b.y;
		cy=Math.pow(cy, 2);
		double cz=this.z+b.z;
		cz=Math.pow(cz, 2);
		suma1=cx+cy+cz;
		suma1=Math.sqrt(suma1);
		double dx=this.x-b.x;
		dx=Math.pow(dx, 2);
		double dy=this.y-b.y;
		dy=Math.pow(dy, 2);
		double dz=this.z-b.z;
		dz=Math.pow(dz, 2);
		resta1=dx+dy+dz;
		resta1=Math.sqrt(resta1);
		if(suma1==resta1) {
			System.out.println("El vector A es ortogonal o perpendicular al vector B");
		}
		else {
			System.out.println("El vector A no es ortogonal o perpendicular al vector B");
		}
	}
	public void Perpendicular(AlgebraVectorial b) {
		double lado2;
		double cx=b.x-this.x;
		cx=Math.pow(cx, 2);
		double cy=b.y-this.y;
		cy=Math.pow(cy, 2);
		double cz=b.z-this.z;
		cz=Math.pow(cz, 2);
		lado2=cx+cy+cz;
		lado2=Math.sqrt(lado2);
		if(resta1==lado2) {
			System.out.println("El vector A es mutuamente ortogonal al vector B");
		}
		else {
			System.out.println("El vector A no es mutuamente ortogonal al vector B");
		}
	}
	public void Perpendicular(AlgebraVectorial b, String p1, String p2) {
		ortogonal=((this.x)*(b.x))+((this.y)*(b.y))+((this.z)*(b.z));
		if(ortogonal==0) {
			System.out.println("El vector A es ortogonal al vector B");
		}
		else {
			System.out.println("El vector A no es ortogonal al vector B");
		}
	}
	public void Perpendicular(AlgebraVectorial b, int a) {
		double normaA;
		double cx=Math.pow(this.x, 2);
		double cy=Math.pow(this.y, 2);
		double cz=Math.pow(this.z, 2);
		normaA=cx+cy+cz;
		normaA=Math.sqrt(normaA);
		double dx=Math.pow(b.x, 2);
		double dy=Math.pow(b.y, 2);
		double dz=Math.pow(b.z, 2);
		normaB=dx+dy+dz;
		normaB=Math.sqrt(normaB);
		if((Math.pow(suma1, 2))==((Math.pow(normaA, 2))+(Math.pow(normaB, 2)))) {
			System.out.println("El vector A es ortogonal al vector B");
		}
		else {
			System.out.println("El vector A no es ortogonal al vector B");
		}
	}
	public void Paralela(AlgebraVectorial b) {
		System.out.println("multiplo");
		double mayor;
		double x;
		double y;
		double z;
		if((this.x>this.y)&&(this.x>this.z)) {
			mayor=this.x;
		}
		else if((this.y>this.x)&&(this.y>this.z)){
			mayor=this.y;
		}
		else {
			mayor=this.z;
		}
		double i=2;
		while(i<=mayor) {
			x=(this.x)/i;
			y=(this.y)/i;
			z=(this.z)/i;
			if(x==b.x && y==b.y && z==b.z) {
				System.out.println("el vector A es paralelo al vector B(multiplo)");
				i=mayor+2;
			}
			else {
				i=i+1;
			}
		}
		if(i==(mayor+1)){
			System.out.println("el vector A no es paralelo al vector B(multiplo)");
		}
	}
		
	public void Paralela(AlgebraVectorial b, String palabra) {
		double x;
		double y;
		double z;
		x=((this.y)*(b.z))-((this.z)*(b.y));
		y=((this.z)*(b.x))-((this.x)*(b.z));
		z=((this.x)*(b.y))-((this.y)*(b.x));
		if(x==0 && y==0 && z==0) {
			System.out.println("El vector A es paralela al vector B");
		}
		else {
			System.out.println("El vector A no es paralela al vector B");
		}
	}
	public void Proyeccion(AlgebraVectorial b) {
		double proy;
		double x;
		double y;
		double z;
		proy=(ortogonal/(Math.pow(normaB, 2)));
		x=(b.x)*proy;
		y=(b.y)*proy;
		z=(b.z)*proy;
		System.out.println("La proyeccion ortogonal del vector A sobre el vector B es: "+"("+x+", "+y+", "+z+")");
	}
	public void Componente() {
		double comp;
		comp=ortogonal/normaB;
		System.out.println("La componente del vector A en la direccion del vector B es:"+comp);
	}
}