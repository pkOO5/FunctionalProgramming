package programming;

import java.util.List;

public class FP01Functional5 {
	
	public static void main(String[] args) {
	List<String> courses = List.of("Spring Boot","Spring MVC","API","AWS","Docker","Kubernetes","Microservices");
	printCoursesInListFunctional(courses);

	}
	
	private static void printCoursesInListFunctional(List<String> courses) {
		// for each element in the list print the element whihch has the length greater than or equal to 4.
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
	}
}
 