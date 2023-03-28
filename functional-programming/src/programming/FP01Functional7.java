package programming;

import java.util.List;

public class FP01Functional7 {
	
	public static void main(String[] args) {
	List<Integer> numbers = List.of(12,4,9,8,7,10,6,3,78,5,7,4);
	printCubesOfOddNumbersInListFunctional(numbers);

	}
	
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {

		// Printing the squares of the even numbers
		numbers.stream()
			.filter(number -> number%2 != 0) //Lambda Expression : number -> number%2 == 0
			.map(number -> number*number*number)
			.forEach(System.out::println); // Method Reference
		
		
	}
}
