package classes;

// Program para Bitonic Sort


//Class
public class BitonicSort {
	
	public BitonicSort() {
		super();
	}
	
	
	
	public void compAndSwap(int a[], int i, int j, int dir)
	    {
		// Intercambia si a[i] y a[j] no cumplen el orden indicado (dir=1 asc, dir=0 desc)
	        if ((a[i] > a[j] && dir == 1)
	            || (a[i] < a[j] && dir == 0)) {
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	    }
	 
	public void bitonicMerge(int a[], int low, int cnt, int dir)
	    {
		// Fusión bitónica: ordena el subarreglo [low..low+cnt) en la dirección dir
	        if (cnt > 1) {
	            int k = cnt / 2;
	         // Compara y mezcla parejas de elementos
	            for (int i = low; i < low + k; i++)
	                compAndSwap(a, i, i + k, dir);
	         // Recursión en cada mitad
	            bitonicMerge(a, low, k, dir);
	            bitonicMerge(a, low + k, k, dir);
	        }
	    }
	 
	public void bitonicSort(int a[], int low, int cnt, int dir)
	    {
		// Ordenamiento bitónico: genera secuencia bitónica y la fusiona
	        if (cnt > 1) {
	            int k = cnt / 2;
	            
	            // Ordena mitad inferior ascendente
	            bitonicSort(a, low, k, 1);

	            // Ordena mitad superior descendente
	            bitonicSort(a, low + k, k, 0);

	         // Fusión bitónica completa ascendente (dir=1)
	            bitonicMerge(a, low, cnt, dir);
	        }
	    }
	 
	 //Funcion para llamar al bitonicSort y ordenar de forma ascendente
	public void sort(int a[], int N, int up)
	    {
	        bitonicSort(a, 0, N, up);
	    }
	 


}
