package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple","banana","mango");

//		fruits.stream()
//			.filter(fruit -> fruit.startsWith("b"))
//			.forEach(System.out :: println);
		
		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		// This returns an Optional as the fruits containing first letter as "b" may or may NOT be present in the list
		// hence we use the optional
		 Optional<String> optional = fruits.stream().filter(predicate).findFirst(); 
		 System.out.println(optional);
		 System.out.println(optional.isEmpty());
		 System.out.println(optional.isPresent());
		 System.out.println(optional.get());
		 
		 Optional <String> fruit = Optional.of("banana");
		 // Recommended approach from Java 8 instead of null
		 Optional<String> empty = Optional.empty();
		
	}

}
