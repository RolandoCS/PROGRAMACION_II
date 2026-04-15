package ejercicio2;
import java.util.*;
class JuegoAdivinaNumero extends Juego {
	Scanner sc=new Scanner(System.in);
	private int numeroAAdivinar;
	private Random random;
	public JuegoAdivinaNumero(int numeroDeVidas) {
		super(numeroDeVidas);
		random = new Random();
	}
	//solo para adivinar numeros entre 0 a 10
	public boolean validaNumero(int n) {
		if(n>=0 && n<=10) {
			System.out.println("el numero esta entre 0 y 10");
			return true;
		}
		else {
			System.out.println("El numero esta fuera del rango");
			return false;
		}
	}
	public void juega() {
		super.reiniciaPartida();
		numeroAAdivinar = random.nextInt(11);
		System.out.println("Número generado (para pruebas): " + numeroAAdivinar);
		int n;
		while(true) {
			System.out.print("Adivina el numero, ingresa un numero entre 0 y 10: ");
			n=sc.nextInt();
			
			if(!validaNumero(n)) {
				System.out.println("intento invalido: sigue intentando");
				continue;
			}
			if(n==numeroAAdivinar) {
				System.out.println("acertaste!!!");
				super.actualizaRecord();
				break;
			}
			else {
				System.out.println("fallaste");
				if(super.quitaVida()) {
					if(numeroAAdivinar>n) {
						System.out.println("el numero a adivinar es mayor que: "+n+", intenta de nuevo");
					}
					else {
						System.out.println("El numero a adivinar es menor que: "+n+", intenta de nuevo");
					}
				}
				else {
					System.out.println("ya no te quedan mas vidas");
					System.out.println("El número era: " + numeroAAdivinar);
					break;
				}
			}
		}
		
	}
	
}
