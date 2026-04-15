package ejercicio1;
public class Aplicacion {
	public static void main(String[] args) {
		//instancia de JuegoAdivinaNumero
		JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3);
		//llama al metodo juega
		juego.juega();
		System.out.println("el juego terminó");
	}
}


