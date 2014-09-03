import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		//ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		
		fillArray(array);
		
		getArrayContent(array);
		
		sortArray(array);
		
		int cores = Runtime.getRuntime().availableProcessors();
		
		System.out.println("\nAvailable cores: "  + cores);
		
		//just a small change..
		//asd
		
	}
	
	public static void fillArray(ArrayList<Integer> array){
		
		Random random = new Random();
		
		for(int i = 0; i <= 1000; i++){
			array.add(i, random.nextInt(1000));
		}
	}
	
	public static void getArrayContent(ArrayList<Integer> array){
		
		System.out.println("Unsorted array: ");
		
		for(int i = 0; i < array.size(); i++){
			System.out.print(array.get(i) + ", ");
		}
	}
	
	public static void sortArray(ArrayList<Integer> array){
				
		for(int i = 0; i < array.size(); i++){
			for(int j = i+1; j < array.size(); j++){
				if(array.get(i) >= array.get(j)){
					Collections.swap(array, i, j);
				}	
			}
		}
		
		System.out.println("\nSorted array: ");
		
		for(int i = 0; i < array.size(); i ++ ){
			System.out.print(array.get(i) +  ", ");
		}		
	}
}
