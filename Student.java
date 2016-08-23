package lab8;

This line was added when in Branch 1.

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
	String id;
	String lastName;
	List<String> courses;
	
	Student( String id, String name ) {
		this.id = id;
		this.lastName = name;
		courses = new ArrayList<>();
	}
	
	public int compareTo( Student rhs ) {
		return this.lastName.compareTo( rhs.lastName );
	}
	
	public String toString() {
		String temp = id + ", " + lastName + "\t";
		for( String crs : courses ) {
			temp += crs + ", ";
		}
		temp = temp.substring(0, temp.length()-2 );
		
		return temp;
	}
	

}
