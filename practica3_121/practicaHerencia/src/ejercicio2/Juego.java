package ejercicio2;
class Juego {
		int numeroDeVidas;
		private int record;
		public Juego(int numeroDeVidas) {
			this.numeroDeVidas = numeroDeVidas;
			this.record=0;
		}
		public void reiniciaPartida() {
			System.out.println("Partida reiniciada");
			System.out.println("cantidad de vidas con las que incias: "+numeroDeVidas);
		}
		public void actualizaRecord() {
			record=record+1;
			System.out.println("record: "+record);
		}
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
