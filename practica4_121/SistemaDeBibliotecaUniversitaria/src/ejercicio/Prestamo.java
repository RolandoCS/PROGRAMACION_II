package ejercicio;
public class Prestamo {
	private String fechaDePrestamo;
	private String fechaDeDevolucion;
	private String ReferenciasEstudianteLibro;
	private Estudiante estudiante;
	private Libro libro;
	public Prestamo(Estudiante estudiante, Libro libro, String fp, String fd, String rel) {
		this.estudiante=estudiante;
		this.libro=libro;
		this.fechaDePrestamo=fp;
		this.fechaDeDevolucion=fd;
		this.ReferenciasEstudianteLibro=rel;
	}
	public void mostrarInfo() {
		estudiante.mostrarInfo();
		System.out.println("===========DATOS DEL PRESTAMO=============");
		System.out.println("libro prestado: "+libro.getTitulo());
		System.out.println("fecha de prestamo: "+fechaDePrestamo);
		System.out.println("fecha de devolucion: "+fechaDeDevolucion);
		System.out.println("ReferenciasEstudianteLibro: "+ReferenciasEstudianteLibro);
	}
}


