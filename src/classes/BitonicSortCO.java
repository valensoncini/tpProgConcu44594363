package classes;

public class BitonicSortCO extends BitonicSort{
	
	public BitonicSortCO() {
		super();
	}
	
	
	 public void bitonicSortParallel(int[] a, int low, int cnt, int dir) throws InterruptedException {
	        if (cnt > 1) {
	            int k = cnt/2;
	            // Crea dos hilos para ordenar cada mitad
	            Thread t1 = new Thread(() -> {
	                try { bitonicSortParallel(a, low, k, 1); } catch (InterruptedException e) {}
	            });
	            Thread t2 = new Thread(() -> {
	                try { bitonicSortParallel(a, low + k, k, 0); } catch (InterruptedException e) {}
	            });
	            t1.start(); 
	            t2.start();
	            // Espera a que ambos hilos terminen
	            t1.join(); 
	            t2.join();
	            // Realiza la fusión bitónica
	            bitonicMerge(a, low, cnt, dir);
	        }
	    }
	

}
