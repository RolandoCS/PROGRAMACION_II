package ejercicio;
import java.util.ArrayList;
public class Biblioteca {
	private String nombreBiblioteca;
	private ArrayList<Libro> librosDisponibles;
	private ArrayList<Autor> autoresRegistrados;
	private ArrayList<Prestamo> prestamosActivos;
	private Horario horarioDeAtencion;
	public class Horario{
		private String DiasApertura;
		private String HoraApertura;
		private String HoraCierre;
		public Horario(String diasApertura, String horaApertura, String horaCierre) {
			this.DiasApertura=diasApertura;
			this.HoraApertura=horaApertura;
			this.HoraCierre=horaCierre;
		}
		public void mostrarHorario() {
			System.out.println("==========HORARIO DE ATENCION DE LA BIBLIOTECA==========");
			System.out.println("----dias de apertura: "+DiasApertura);
			System.out.println("----hora de apertura: "+HoraApertura);
			System.out.println("----hora de cierre: "+HoraCierre);
		}
	}
	public Biblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
		this.librosDisponibles = new ArrayList<>();
        this.autoresRegistrados = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horarioDeAtencion=new Horario("sabados a domingos", "09:00", "12:00");
	}
	public void agregarLibro(Libro libro) {
		if(!librosDisponibles.contains(libro)){
			this.librosDisponibles.add(libro);
			}
	}
	public void agregarAutor(Autor autor) {
		if(!autoresRegistrados.contains(autor)){
			this.autoresRegistrados.add(autor);
			}
	}
	public void prestarLibro(Estudiante estudiante, Libro libro, String fp, String fd, String rel) {
		prestamosActivos.add(new Prestamo(estudiante, libro, fp, fd, rel));
	}
	public void mostrarEstado() {
		System.out.println("\n--- ESTADO BIBLIOTECA " + nombreBiblioteca + " ---");
        horarioDeAtencion.mostrarHorario();
        System.out.println("Libros: " + librosDisponibles.size() + " | Autores: " + autoresRegistrados.size());
        for (Prestamo p : prestamosActivos) p.mostrarInfo();
	}
	public void cerrarBiblioteca(){
		System.out.println("\nCerrando sistema...");
        this.prestamosActivos.clear();
        System.out.println("Los préstamos han dejado de existir.");
	}
}
