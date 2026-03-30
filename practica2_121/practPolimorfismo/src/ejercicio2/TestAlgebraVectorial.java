package ejercicio2;
public class TestAlgebraVectorial {
	public static void main(String[] args) {
		AlgebraVectorial VectorA=new AlgebraVectorial();
		AlgebraVectorial VectorB=new AlgebraVectorial();
		System.out.println("llenar componentes del vector A ");
		VectorA.llenarVector();
		System.out.println("llenar componentes del vector B");
		VectorB.llenarVector();
		VectorA.Perpendicular(VectorB,"");
		VectorA.Perpendicular(VectorB);
		VectorA.Perpendicular(VectorB, "", "");
		VectorA.Perpendicular(VectorB, 8);
		VectorA.Paralela(VectorB);
		VectorA.Paralela(VectorB, "");
		VectorA.Proyeccion(VectorB);
		VectorA.Componente();
	}
}