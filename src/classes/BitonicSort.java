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
		// Fusi�n bit�nica: ordena el subarreglo [low..low+cnt) en la direcci�n dir
	        if (cnt > 1) {
	            int k = cnt / 2;
	         // Compara y mezcla parejas de elementos
	            for (int i = low; i < low + k; i++)
	                compAndSwap(a, i, i + k, dir);
	         // Recursi�n en cada mitad
	            bitonicMerge(a, low, k, dir);
	            bitonicMerge(a, low + k, k, dir);
	        }
	    }
	 
	public void bitonicSort(int a[], int low, int cnt, int dir)
	    {
		// Ordenamiento bit�nico: genera secuencia bit�nica y la fusiona
	        if (cnt > 1) {
	            int k = cnt / 2;
	            
	            // Ordena mitad inferior ascendente
	            bitonicSort(a, low, k, 1);

	            // Ordena mitad superior descendente
	            bitonicSort(a, low + k, k, 0);

	         // Fusi�n bit�nica completa ascendente (dir=1)
	            bitonicMerge(a, low, cnt, dir);
	        }
	    }
	 
	 //Funcion para llamar al bitonicSort y ordenar de forma ascendente
	public void sort(int a[], int N, int up)
	    {
	        bitonicSort(a, 0, N, up);
	    }
	//funcion para que funcione con nº de elementos que no son potencia de 2
		public int mayorPotencia2De(int n) {
			int i = 1;
			while(i<n && i>0) {
				i = i*2;
			}
			
			return i/2;
		}


}
