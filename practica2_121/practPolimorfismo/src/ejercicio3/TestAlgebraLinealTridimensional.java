package ejercicio3;
public class TestAlgebraLinealTridimensional {
	public static void main(String[] args) {
		AlgebraVectorialTridimensional VectorA=new AlgebraVectorialTridimensional();
		AlgebraVectorialTridimensional VectorB=new AlgebraVectorialTridimensional();
		System.out.println("llenar componentes del vector A ");
		VectorA.llenarVector();
		System.out.println("llenar componentes del vector B");
		VectorB.llenarVector();
		System.out.println("suma de los vectores A y B: ");
		VectorA.algebra1(VectorB);
		VectorA.algebra1();
		VectorA.algebra1("");
		VectorA.algebra2();
		VectorA.algebra2(VectorB);
		VectorA.algebra2(VectorB,"");
	}
}
