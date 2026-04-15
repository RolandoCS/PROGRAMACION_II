package ejercicio2;
import java.util.*;
class JuegoAdivinaPar extends JuegoAdivinaNumero{
	public JuegoAdivinaPar(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	public boolean validaNumero(int n) {
		if(n%2==0) {
			if(n>=0 && n<=10){
				System.out.println("el numero es par y esta dentro el rango 0 a 10");
				return true;
			}
			else {
				System.out.println("el numero es par, pero no esta dentro del rango 0 a 10");
				return false;
			}
		}
		else {
			System.out.println("ERROR: debes ingresar numeros pares: 2, 4, 6, 8, 10");
			return false;
		}
	}
}
