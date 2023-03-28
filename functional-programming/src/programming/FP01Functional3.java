package programming;

import java.util.List;

public class FP01Functional3 {
	
	public static void main(String[] args) {
	List<String> courses = List.of("Spring Boot","SPring MVC","API","AWS","Docker","Kubernetes","Microservices");
	printCoursesInListFunctional(courses);

	}
	
	private static void printCoursesInListFunctional(List<String> courses) {
		// for each element in the list print the element
		courses.stream()
			.forEach(System.out::println);
	}
}
