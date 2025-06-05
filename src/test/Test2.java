package test;
import classes.ArrayLibrary;
import classes.BitonicSortCO;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Inicializacion de tamanios y arrays
		//El tamaño debe ser potencia de 2
		int tam1 = 16;
		int tam2 = 1024;
		int tam3 = 16384;
		
		int array1[]  = new int[tam1];
		int array2[]  = new int[tam2];
		int array3[]  = new int[tam3];
		
		
		//------------------------------------------------
		
		ArrayLibrary libreriaArrays = new ArrayLibrary();
		
		//inicializa los arrays en 0
		libreriaArrays.initiateArray(array1, tam1);
		//libreriaArrays.initiateArray(array2, tam2);
		//libreriaArrays.initiateArray(array3, tam3);
				
		//le carga a los arrays un numero random del 0 al 100
		libreriaArrays.setArray(array1, tam1);
		//libreriaArrays.setArray(array2, tam2);
		//libreriaArrays.setArray(array3, tam3);
				
		//funcion que los muestra por pantalla
		System.out.println("Sin ordenar");
		libreriaArrays.showArray(array1, tam1);
		//libreriaArrays.showArray(array2, tam2);
		//libreriaArrays.showArray(array3, tam3);
		
		
		//------------------------------------------------
		
		//inicia el sort concurrente del Bitonic 
		
		System.out.println();
		System.out.println("inicia el sort concurrente del Bitonic");
				
		BitonicSortCO concurrencia = new BitonicSortCO();
		long duracionConcurrente = 0;
		
		//------------------------------------------------
		
		//Array 1 con tamanio 16
				
		long inicioCo = System.nanoTime();

		try {
			concurrencia.bitonicSortParallel(array1, 0,tam1, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long finCo = System.nanoTime();
	
		duracionConcurrente = finCo - inicioCo;
		double segundos = duracionConcurrente/1000000000.0;
		System.out.println();
		System.out.println(segundos);
		duracionConcurrente = 0;
				
				
				
		System.out.println();
		System.out.println("Ordenados");
		libreriaArrays.showArray(array1, tam1);
		
		
		//------------------------------------------------
		
		
		//Array 2 con tamanio 1024
		/*long inicioCo2 = System.nanoTime();

		try {
			concurrencia.bitonicSortParallel(array2, 0,tam2, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long finCo2 = System.nanoTime();
	
		duracionConcurrente = finCo2 - inicioCo2;
		double segundos2 = duracionConcurrente/1000000000.0;
		System.out.println();
		System.out.println(segundos2);
		duracionConcurrente = 0;
				
				
				
		System.out.println();
		System.out.println("Ordenados");
		libreriaArrays.showArray(array2, tam2);*/
		
		//------------------------------------------------
		
		
		//Array 3 con tamanio 16384
		/*long inicioCo3 = System.nanoTime();

		try {
			concurrencia.bitonicSortParallel(array3, 0,tam3, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long finCo3 = System.nanoTime();
	
		duracionConcurrente = finCo3 - inicioCo3;
		double segundos3 = duracionConcurrente/1000000000.0;
		System.out.println();
		System.out.println(segundos3);
		duracionConcurrente = 0;
				
				
				
		System.out.println();
		System.out.println("Ordenados");
		libreriaArrays.showArray(array3, tam3);*/
		
		
		//------------------------------------------------

	}

}
