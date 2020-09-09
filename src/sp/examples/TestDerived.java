package sp.examples;

import sp.Course;
import sp.SpFactory;

public class TestDerived {

	public static void main(String[] args) {
		Course course = SpFactory.eINSTANCE.createCourse();
		
		course.setCourse("IT3920 - Master in Informatics, Preparatory Project");
		
		System.out.println(course.getCode() + " - " + course.getName());
	}
	
}
