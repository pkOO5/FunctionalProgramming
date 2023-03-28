package programming;

import java.util.List;

public class FP01Functional4 {
	
	public static void main(String[] args) {
	List<String> courses = List.of("Spring Boot","Spring MVC","API","AWS","Docker","Kubernetes","Microservices");
	printCoursesInListFunctional(courses);

	}
	
	private static void printCoursesInListFunctional(List<String> courses) {
		// for each element in the list print the element that contains "Spring" in it.
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}
}
