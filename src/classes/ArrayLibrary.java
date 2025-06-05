package classes;
import java.util.Random;
public class ArrayLibrary {
	
	public ArrayLibrary() {
		super();
	}
	
	public void initiateArray(int [] a, int t) {
		for(int i=0;i<t;i++) {
			a[i] = 0;
		}
	}
	
	public void setArray(int [] a, int t) {
		Random randomNumbers = new Random();
		for(int i=0;i<t;i++) {
			a[i] = randomNumbers.nextInt(91)+10;
		}
	}
	
	public void showArray(int [] a, int t) {
		for(int i=0;i<t;i++) {
			System.out.print("{ "+a[i]+" }");;
		}
	}
	

}
