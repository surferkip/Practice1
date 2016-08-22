package lab8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// This line was also added from the SVN work folder.

public class StudentTest {

	List<Student> students = new ArrayList<>();
	Map<String,Integer> courseMap = new TreeMap<>();
	
	StudentTest() {
		// create the list
		Student S;
		S = new Student("0001", "Smith");
		S.courses.add("COP2250");
		S.courses.add("COP3250");
		S.courses.add("COP4250");
		students.add( S );

		S = new Student("0002", "Chong");
		S.courses.add("COP1210");
		S.courses.add("COP3337");
		S.courses.add("COP3530");
		students.add( S );

		S = new Student("0013", "Ramirez");
		S.courses.add("ENC1105");
		S.courses.add("ENC3250");
		S.courses.add("REL2210");
		students.add( S );
		
		S = new Student("0026", "Fujioka");
		S.courses.add("COP2250");
		S.courses.add("COP3250");
		S.courses.add("COP4250");
		students.add( S );

		S = new Student("0032", "Johnson");
		S.courses.add("COP1210");
		S.courses.add("COP3337");
		S.courses.add("COP3530");
		students.add( S );
		
		S = new Student("0044", "Pierrot");
		S.courses.add("ENC1105");
		S.courses.add("ENC3250");
		S.courses.add("REL2210");
		students.add( S );
		
		S = new Student("0027", "O'Malley");
		S.courses.add("COP2250");
		S.courses.add("COP3250");
		S.courses.add("COP4250");
		students.add( S );
		
		S = new Student("0008", "Alvarez");
		S.courses.add("COP2250");
		S.courses.add("COP3250");
		S.courses.add("COP4250");
		students.add( S );
		
		S = new Student("0010", "Kim");
		S.courses.add("COP1210");
		S.courses.add("COP3337");
		S.courses.add("COP3530");
		students.add( S );
		
		S = new Student("0011", "Wong");
		S.courses.add("ENC1105");
		S.courses.add("ENC3250");
		S.courses.add("REL2210");
		students.add( S );

	}
	
	void start() {

		Collections.sort( students );
		
		for( Student S : students ) {
			System.out.println( S.toString() );	
		}
		
		// Build the courses map (new to Lab 8)
		for( Student S : students ) {
			for( String aCourse : S.courses ) {
				if( !courseMap.containsKey(aCourse) )
					courseMap.put(aCourse, 1);
				else {
					int count = courseMap.get(aCourse) + 1;
					courseMap.put(aCourse, count);
				}
			} // for each course			
		} // for each student
		
		// Display the Map
		System.out.println("---------- Course Enrollments ------------");
		for( Map.Entry<String, Integer> entry : courseMap.entrySet() ) {
			System.out.println(entry.getKey() + " -- " + entry.getValue() );
		}
		
		
		
	} // start
	
	public static void main(String[] args) {
		new StudentTest().start();

	}

}
