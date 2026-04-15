package ejercicio1;
public class Juego {
	//a)añada los atributos enteros: numeroDeVidas y record
	int numeroDeVidas;
	private int record;
	public Juego(int numeroDeVidas) {
		this.numeroDeVidas = numeroDeVidas;
		this.record=0;
	}
	//b)metodo reiniciaPartida
	public void reiniciaPartida() {
		System.out.println("Partida reiniciada");
		System.out.println("cantidad de vidas con las que incias: "+numeroDeVidas);
	}
	//metodo actualizaRecord
	public void actualizaRecord() {
		record=record+1;
		System.out.println("record: "+record);
	}
	//metodo quitaVida
	public boolean quitaVida() {
		numeroDeVidas=numeroDeVidas-1;
		if(numeroDeVidas>0) {
			System.out.println("aun te quedan vidas: "+numeroDeVidas+" vidas");
			return true;
		}
		else {
			return false;
		}
	}
}

