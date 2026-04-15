package ejercicio2;
public class Aplicacion {
	public static void main(String[] args) {
		//instancia de JuegoAdivinaNumero
				JuegoAdivinaNumero juego1=new JuegoAdivinaNumero(3);
				JuegoAdivinaPar juego2=new JuegoAdivinaPar(3);
				JuegoAdivinaImpar juego3=new JuegoAdivinaImpar(3);
				//llama al metodo juega
				System.out.println("ADIVINA EL NUMERO ENTRE 0 A 1O");
				juego1.juega();
				System.out.println("ADIVINA EL NUMERO PAR ENTRE LOS PARES QUE HAY ENTRE 0 A 1O");
				juego2.juega();
				System.out.println("ADIVINA EL NUMERO IMPAR ENTRE LOS PARES QUE HAY ENTRE 0 A 1O");
				juego3.juega();
				System.out.println("el juego terminó");
	}
}
