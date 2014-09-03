import java.util.ArrayList;
import java.util.Random;

public class fifo {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		addToArray(array);
		
		pullFromArray(array);
		
	}
	
	public static void addToArray(ArrayList<Integer> array){
		
		Random random = new Random();
		
		for(int i = 0; i <= 10; i++){
			int temp = random.nextInt(1000);
			array.add(i, temp);
			System.out.println(temp + " added at entry " + i);
		}
		
		System.out.println("\n\n");
	}
	
	public static void pullFromArray(ArrayList<Integer> array){
		
		int counter = 0;
		
		while(array.isEmpty() != true){
			System.out.println(array.get(0) + " has been removed from the array.");
			array.remove(0);
			counter++;
		}
		/*
		for(int i = 0; i < array.size(); i++){
			
		}
		
		*/
		System.out.println("\nTotal entries: " + counter);
		
	}
}
