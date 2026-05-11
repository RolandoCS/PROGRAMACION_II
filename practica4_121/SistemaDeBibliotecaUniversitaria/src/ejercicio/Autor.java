package ejercicio;
public class Autor {
	private String nombre;
	private String nacionalidad;
	public Autor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	public void mostrarInfo() {
		System.out.println("==========DATOS DEL AUTOR==========");
		System.out.println("Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]");
	}
}

