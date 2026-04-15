package ejercicio1;
import java.util.*;
class JuegoAdivinaNumero extends Juego {//a)deriva de la clase Juego
	Scanner sc=new Scanner(System.in);
	private int numeroAAdivinar;//b) atributo entero numeroAAdivinar
	private Random random;
	public JuegoAdivinaNumero(int numeroDeVidas) {//c)constructor con el parametro numero de vida 
		super(numeroDeVidas);//pasa al constructor de la clase padre
		random = new Random();
	}
	public void juega() {//d)metodo Juega
		super.reiniciaPartida();//d1)llama al metodo reiniciaPartida
		numeroAAdivinar = random.nextInt(11);//d2)genera un numero aleatorio entre 0 y 10
		System.out.println("Número generado (para pruebas): " + numeroAAdivinar);
		int n;
		while(true) {
			System.out.println("Adivina el numero, ingresa un numero entre 1 y 10: ");//d3)mensaje pidiendo adivinar numero aleatorio
			n=sc.nextInt();//d4)lee numero de teclado y compara con el numero aleatorio
			if(n==numeroAAdivinar) {
				System.out.println("acertaste!!!");//d4a)mensaje:acertaste
				super.actualizaRecord();//llama a actualizaRecord
				break;//llama a actualizaRecord
			}
			else {
				System.out.println("fallaste");
				if(super.quitaVida()) {//d4b)llama al metodo quitaVida
					if(numeroAAdivinar>n) {//d4c)mensaje si el numero aleatorio es mayor o menor
						System.out.println("el numero a adivinar es mayor que: "+n+", intenta de nuevo");
					}
					else {//se pide que el usuario lo intente de nuevo
						System.out.println("El numero a adivinar es menor que: "+n+", intenta de nuevo");
					}
				}
				else {
					System.out.println("ya no te quedan mas vidas");
					System.out.println("El número era: " + numeroAAdivinar);
					break;//d4d)sale del metodo
				}
			}
		}
		
	}
}
