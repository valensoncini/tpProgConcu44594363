package test;
import classes.ArrayLibrary;
import classes.BitonicSortCO;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Inicializacion de tamanios y arrays
				
					BitonicSortCO concurrencia = new BitonicSortCO();
					int tam1 = concurrencia.mayorPotencia2De(10);
					int tam2 = concurrencia.mayorPotencia2De(1000);
					int tam3 = concurrencia.mayorPotencia2De(10000);
					int tam4 = concurrencia.mayorPotencia2De(100000);
					
					int array1[]  = new int[tam1];
					int array2[]  = new int[tam2];
					int array3[]  = new int[tam3];
					int array4[]  = new int[tam4];
					
					
					//------------------------------------------------
					
					ArrayLibrary libreriaArrays = new ArrayLibrary();
					
					//inicializa los arrays en 0
					//libreriaArrays.initiateArray(array1, tam1);
					//libreriaArrays.initiateArray(array2, tam2);
					//libreriaArrays.initiateArray(array3, tam3);
					//libreriaArrays.initiateArray(array4, tam4);
							
					//le carga a los arrays un numero random del 0 al 100
					//libreriaArrays.setArray(array1, tam1);
					//libreriaArrays.setArray(array2, tam2);
					//libreriaArrays.setArray(array3, tam3);
					//libreriaArrays.setArray(array4, tam4);
							
					//funcion que los muestra por pantalla
					System.out.println("Sin ordenar");
					//libreriaArrays.showArray(array1, tam1);
					//libreriaArrays.showArray(array2, tam2);
					//libreriaArrays.showArray(array3, tam3);
					//libreriaArrays.showArray(array4, tam4);
					
					
					//------------------------------------------------
					
					//inicia el sort concurrente del Bitonic 
					
					System.out.println();
					System.out.println("inicia el sort concurrente del Bitonic");
							
					
					long duracionConcurrente = 0;
					
					//------------------------------------------------
					
					//Array 1 
							
				/*	long inicioCo = System.nanoTime();

					try {
						concurrencia.bitonicSortParallel(array1, 0,tam1, 1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long finCo = System.nanoTime();
				
					duracionConcurrente = finCo - inicioCo;
					
					System.out.println();
					System.out.println(duracionConcurrente);
					duracionConcurrente = 0;
							
							
							
					System.out.println();
					System.out.println("Ordenados");
					libreriaArrays.showArray(array1, tam1);*/
					
					
					//------------------------------------------------
					
					
					//Array 2 
					/*long inicioCo2 = System.nanoTime();

					try {
						concurrencia.bitonicSortParallel(array2, 0,tam2, 1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long finCo2 = System.nanoTime();
				
					duracionConcurrente = finCo2 - inicioCo2;
					//double segundos2 = duracionConcurrente/1000000000.0;
					System.out.println();
					System.out.println(duracionConcurrente);
					duracionConcurrente = 0;
							
							
							
					System.out.println();
					System.out.println("Ordenados");
					libreriaArrays.showArray(array2, tam2);*/
					
					//------------------------------------------------
					
					
					//Array 3 
					/*long inicioCo3 = System.nanoTime();

					try {
						concurrencia.bitonicSortParallel(array3, 0,tam3, 1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long finCo3 = System.nanoTime();
				
					duracionConcurrente = finCo3 - inicioCo3;
					
					System.out.println();
					System.out.println(duracionConcurrente);
					duracionConcurrente = 0;
							
							
							
					System.out.println();
					System.out.println("Ordenados");
					//libreriaArrays.showArray(array3, tam3);*/
					
					
					//------------------------------------------------

					
					//Array 4
				/*	long inicioCo4 = System.nanoTime();

					try {
						concurrencia.bitonicSortParallel(array4, 0,tam4, 1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					long finCo4 = System.nanoTime();
				
					duracionConcurrente = finCo4 - inicioCo4;
					//double segundos4 = duracionConcurrente/1000000000.0;
					System.out.println();
					System.out.println(duracionConcurrente);
					duracionConcurrente = 0;
							
							
							
					System.out.println();
					System.out.println("Ordenados");
					//libreriaArrays.showArray(array4, tam4);*/
					
					
					//------------------------------------------------
	}

}
