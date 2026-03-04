package ejercicio1;
import java.util.Random;
public class cronometro {
	private long inicia;// a)atributos privados
	private long finaliza;
	public cronometro() {// b)constructor que inicializa con la hora actual
		this.inicia = System.currentTimeMillis();
	}
	public void inicia() {// c)metodo inicia()
		this.inicia = System.currentTimeMillis();
	}
	public void detener() {// d)metodo detener()
		this.finaliza = System.currentTimeMillis();
	}
	public long lapsoDeTiempo() {// e)metodo LapsoDeTiempo()
		return finaliza - inicia;
	}
	public long getInicia() {// a)atributo "inicia" con metodo getter
		return inicia;
	}
	public long getFinaliza() {// a)atributo "detener" con metodo getter
		return finaliza;
	}
}




