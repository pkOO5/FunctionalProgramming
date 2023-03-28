package programming;

import java.util.List;

public class FP01Structured {
	
	public static void main(String[] args) {
	List<Integer> numbers = List.of(12,4,9,8,7,10,6,3,78,5,7,4);
	//printAllNumbersInListStructured(numbers);
	printEvenNumbersInListStructured(numbers);

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// This is the Structured approach
		for(Integer number:numbers) {
			if(number %2 == 0 )
			System.out.println(number);
		}
		
	}
}
