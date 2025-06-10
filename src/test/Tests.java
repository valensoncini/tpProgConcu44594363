package test;
import classes.BitonicSort;
import classes.BitonicSortCO;
import classes.ArrayLibrary;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Inicializacion de tamanios y arrays
		
				BitonicSort sortBitonico = new BitonicSort();
				int tam1 = sortBitonico.mayorPotencia2De(10);
				int tam2 = sortBitonico.mayorPotencia2De(1000);
				int tam3 = sortBitonico.mayorPotencia2De(10000);
				int tam4 = sortBitonico.mayorPotencia2De(100000);
				
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
				
				//inicia el sort secuencial del Bitonic 
				System.out.println();
				System.out.println("inicia el sort secuencial del Bitonic");
				
				
				long duracion = 0;
				
				
				//------------------------------------------------
				
				
				//Array 1
				/*long inicio = System.nanoTime();
				sortBitonico.bitonicSort(array1, 0,tam1, 1);
				long fin = System.nanoTime();
				duracion = fin - inicio;
				System.out.println();
				System.out.println(duracion);
				duracion = 0;
				
				System.out.println();
				System.out.println("Ordenados");
				//libreriaArrays.showArray(array1, tam1);*/
				
				//------------------------------------------------
				
				//Array 2 
				/*long inicio2 = System.nanoTime();
				sortBitonico.bitonicSort(array2, 0,tam2, 1);
				long fin2 = System.nanoTime();
				duracion = fin2 - inicio2;
				System.out.println(duracion);
				duracion = 0;
				
				System.out.println();
				System.out.println("Ordenados");
				//libreriaArrays.showArray(array2, tam2);*/
				
				//------------------------------------------------
				
				//Array 3 
				/*long inicio3 = System.nanoTime();
				sortBitonico.bitonicSort(array3, 0,tam3, 1);
				long fin3 = System.nanoTime();
				duracion = fin3 - inicio3;
				System.out.println(duracion);
				duracion = 0;
				
				System.out.println();
				System.out.println("Ordenados");
				//libreriaArrays.showArray(array3, tam3);*/
				
				
			
				//------------------------------------------------
				
				//Array 4
				/*long inicio4 = System.nanoTime();
				sortBitonico.bitonicSort(array4, 0,tam4, 1);
				long fin4 = System.nanoTime();
				duracion = fin4 - inicio4;
				System.out.println(duracion);
				duracion = 0;
						
				System.out.println();
				System.out.println("Ordenados");
				//libreriaArrays.showArray(array4, tam4);*/
			
				//------------------------------------------------
		
		
		
		
	}

}
