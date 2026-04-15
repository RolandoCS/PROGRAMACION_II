package ejercicio2;
import java.util.*;
class JuegoAdivinaImpar extends JuegoAdivinaNumero{
	public JuegoAdivinaImpar(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	public boolean validaNumero(int n) {
		if(n%2==1) {
			if(n>=0 && n<=10){
				System.out.println("el numero es impar y esta dentro el rango 0 a 10");
				return true;
			}
			else {
				System.out.println("el numero es impar, pero no esta dentro del rango 0 a 10");
				return false;
			}
		}
		else {
			System.out.println("ERROR: el numero es par");
			return false;
		}
	}
}
