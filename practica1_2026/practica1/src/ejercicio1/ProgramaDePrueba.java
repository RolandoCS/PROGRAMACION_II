package ejercicio1;
import java.util.Random;
public class ProgramaDePrueba {
    public static void main(String[] args) {
        final int tamaño=100000;
        int[] arreglo=new int[tamaño];
        Random random=new Random();
        for (int i=0;i<tamaño;i++) {
            arreglo[i]=random.nextInt(100000);
        }
        cronometro cronometro=new cronometro();
        cronometro.inicia();
        for (int i=0;i<arreglo.length-1;i++) {
            int indiceMinimo=i;
            for (int j=i+1;j<arreglo.length;j++) {
                if (arreglo[j]<arreglo[indiceMinimo]) {
                    indiceMinimo=j;
                }
            }
            int temp=arreglo[i];
            arreglo[i]=arreglo[indiceMinimo];
            arreglo[indiceMinimo]=temp;
        }
        cronometro.detener();
        System.out.println("Tiempo de ejecución(ms): "+cronometro.lapsoDeTiempo());
    }
}




