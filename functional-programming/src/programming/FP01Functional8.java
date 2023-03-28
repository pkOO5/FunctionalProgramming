package programming;

import java.util.List;

public class FP01Functional8 {
	
	public static void main(String[] args) {
	List<String> courses = List.of("Spring Boot","Spring MVC","API","AWS","Docker","Kubernetes","Microservices");
	printCoursesInListFunctional(courses);

	}
	
	private static void printCoursesInListFunctional(List<String> courses) {
		// for each element in the list print the length of the element
		courses.stream()
			.map(course -> course + " " + course.length())
			.forEach(System.out::println);
	}
}