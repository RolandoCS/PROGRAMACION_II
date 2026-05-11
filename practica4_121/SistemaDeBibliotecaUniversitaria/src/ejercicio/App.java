package ejercicio;
public class App {
	public static void main(String[] args) {
		Biblioteca umsa = new Biblioteca("UMSA-Biblioteca de informatica");
        Autor autor = new Autor("Alcides Arguedas", "Boliviano");
        Libro libro = new Libro("Raza de bronce", "123-ABC", new String[]{"Introducción", "Capítulo 1"});
        umsa.agregarAutor(autor);
        umsa.agregarLibro(libro);
        Estudiante est = new Estudiante("Juanito Perez", "1878079");
        umsa.prestarLibro(est, libro,"11/05/02026", "12/05/2026", "refEstLib");
        libro.leer();
        umsa.mostrarEstado();
        umsa.cerrarBiblioteca();
	}
}


