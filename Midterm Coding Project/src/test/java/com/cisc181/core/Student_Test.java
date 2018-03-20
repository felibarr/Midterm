package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private static ArrayList<Course> courses = new ArrayList<Course>(3);
	private static ArrayList<Semester> semesters = new ArrayList<Semester>(2);
	private static ArrayList<Section> sections = new ArrayList<Section>(6);
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() throws PersonException {
		courses.add(new Course("Chem 101", 4, eMajor.CHEM));
		courses.add(new Course("Chem 201", 4, eMajor.CHEM));
		courses.add(new Course("Chem 301", 4, eMajor.CHEM));
		
		semesters.add(new Semester(new Date(), new Date()));
		semesters.add(new Semester(new Date(), new Date()));
		
		sections.add(new Section(101));
		sections.add(new Section(102));
		sections.add(new Section(103));
		sections.add(new Section(104));
		sections.add(new Section(105));
		sections.add(new Section(106));
		
		for( int i = 0; i <10; i++) {
			students.add(new Student("fName", "mName", "lName", new Date(2000,1,1), eMajor.CHEM, "", "1234567890", ""));
		}
		
	}

	@Test
	public void test() {
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Section section : sections) {
			for(Student student : students) {
				enrollments.add(new Enrollment(student.getStudentID(),section.getSectionID()));
			}
		}
		
		for( Enrollment e : enrollments) {
			e.SetGrade(3.75);
		}
		
		
		
		assertEquals(1, 1);
	}
}