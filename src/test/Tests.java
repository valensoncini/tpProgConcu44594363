package test;
import classes.BitonicSort;
import classes.ArrayLibrary;

public class Tests {

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
		
		
		ArrayLibrary libreriaArrays = new ArrayLibrary();
		
		//inicializa los arrays en 0
		//libreriaArrays.initiateArray(array1, tam1);
		libreriaArrays.initiateArray(array2, tam2);
		//libreriaArrays.initiateArray(array3, tam3);
		
		//le carga a los arrays un numero random del 0 al 100
		//libreriaArrays.setArray(array1, tam1);
		libreriaArrays.setArray(array2, tam2);
		//libreriaArrays.setArray(array3, tam3);
		
		//funcion que los muestra por pantalla
		System.out.println("Sin ordenar");
		//libreriaArrays.showArray(array1, tam1);
		libreriaArrays.showArray(array2, tam2);
		//libreriaArrays.showArray(array3, tam3);
		
		//inicia el sort secuencial del Bitonic 
		
		BitonicSort sortBitonico = new BitonicSort();
		
		//sortBitonico.bitonicSort(array1, 0,tam1, 1);
		sortBitonico.bitonicSort(array2, 0,tam2, 1);
		//sortBitonico.bitonicSort(array3, 0,tam3, 1);
		System.out.println();
		System.out.println("Ordenados");
		//libreriaArrays.showArray(array1, tam1);
		libreriaArrays.showArray(array2, tam2);
		//libreriaArrays.showArray(array3, tam3);
		
		
		
		
	}

}
