package ejercicio;
public class Estudiante {
	private String CodigoDelEstudiante;
	private String nombre;
	public Estudiante(String nom, String cod) {
		this.nombre=nom;
		this.CodigoDelEstudiante=cod;
	}
	public void mostrarInfo() {
		System.out.println("==========DATOS DEL ESTUDIANTE==========");
		System.out.println("Estudiante [CodigoDelEstudiante=" + CodigoDelEstudiante + ", nombre=" + nombre + "]");
	}
}
