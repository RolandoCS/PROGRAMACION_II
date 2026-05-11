package ejercicio;
import java.util.*;
public class Libro {
	private String titulo;
	private String ISBN;
	private ArrayList<Pagina> paginas;
	public class Pagina{
		private int numeroPagina;
		private String contenidoPagina;
		public Pagina(int npag, String contPag) {
			this.numeroPagina=npag;
			this.contenidoPagina=contPag;
		}
		public void mostrarHorario() {
			System.out.println("==========HORARIO DE ATENCION DE LA BIBLIOTECA==========");
			System.out.println("----dias de apertura: sabados y domingos");
			System.out.println("----hora de apertura: 09:00");
			System.out.println("----hora de cierre: 12:00");
		}
	}
	public Libro(String titulo, String iSBN, String [] contenidos) {
		this.titulo = titulo;
		this.ISBN = iSBN;
		this.paginas = new ArrayList<>();
		for(int i=0;i<contenidos.length;i++) {
			this.paginas.add(new Pagina(i+1, contenidos[i]));
		}
	}
	public void leer() {
		System.out.println("titulo del libro: "+titulo);
		for(Pagina p:paginas) {
			p.mostrarHorario();
		}
	}
	public String getTitulo() {
		return titulo;
	}
}
