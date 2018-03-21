package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	private static ArrayList<Enrollment> StudentEnroll = new ArrayList<Enrollment>();
	private static ArrayList<course> StudentCourse = new ArrayList<course>();
	private static ArrayList<Semester> semester = new ArrayList<Semester>();
	private static ArrayList<Section> StudentSection = new ArrayList<Section>();
	private static ArrayList<Student> students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() throws PersonException {
		final UUID CHEM302 = UUID.randomUUID();	
		final UUID CHEM527 = UUID.randomUUID();
		final UUID CISC181 = UUID.randomUUID();
		course course1 = new course(CHEM302, "Organic Chemistry II", 3, eMajor.CHEM);
		course course2 = new course(CHEM527, "Biochemstry", 3, eMajor.CHEM);
		course course3 = new course(CISC181, "Intro to CISC II", 3, eMajor.COMPSI);
		StudentCourse.add(course1);
		StudentCourse.add(course2);
		StudentCourse.add(course3);
		
		final UUID SPRING = UUID.randomUUID();
		final UUID FALL = UUID.randomUUID();

		Semester Spring = new Semester(SPRING, new Date(2018, 2, 5), new Date(2018, 5, 30));
		Semester Fall = new Semester(SPRING, new Date(2017, 9, 1), new Date(2017, 12, 20));
		semester.add(Spring);
		semester.add(Fall);
		
		students.add(new Student("Ashe", "Akali", "Zed", new Date(1992, 10, 25), eMajor.COMPSI,"334 E Main St, Newark, DE, 19711", "(334)-444-4441", "AAZ@Udel.edu"));
		students.add(new Student("Bard", "Akali", "Zed", new Date(1991, 10, 25), eMajor.BUSINESS,"335 E Main St, Newark, DE, 19711", "(334)-444-4442", "BAZ@Udel.edu"));
		students.add(new Student("Cait", "Akali", "Zed", new Date(1990, 10, 25), eMajor.CHEM,"336 E Main St, Newark, DE, 19711", "(334)-444-4443", "CAZ@Udel.edu"));
		students.add(new Student("Dough", "Akali", "Zed", new Date(1989, 10, 25), eMajor.COMPSI,"337 E Main St, Newark, DE, 19711", "(334)-444-4444", "DAZ@Udel.edu"));
		students.add(new Student("Erin", "Akali", "Zed", new Date(1988, 10, 25), eMajor.NURSING,"338 E Main St, Newark, DE, 19711", "(334)-444-4445", "EAZ@Udel.edu"));
		students.add(new Student("Frank", "Akali", "Zed", new Date(1987, 10, 25), eMajor.COMPSI,"339 E Main St, Newark, DE, 19711", "(334)-444-4446", "FAZ@Udel.edu"));
		students.add(new Student("Grey", "Akali", "Zed", new Date(1986, 10, 25), eMajor.PHYSICS,"340 E Main St, Newark, DE, 19711", "(334)-444-4447", "GAZ@Udel.edu"));
		students.add(new Student("Hill", "Akali", "Zed", new Date(1985, 10, 25), eMajor.COMPSI,"341 E Main St, Newark, DE, 19711", "(334)-444-4448", "HAZ@Udel.edu"));
		students.add(new Student("Illoi", "Akali", "Zed", new Date(1984, 10, 25), eMajor.CHEM,"342 E Main St, Newark, DE, 19711", "(334)-444-4449", "IAZ@Udel.edu"));
		students.add(new Student("Jhin", "Akali", "Zed", new Date(1983, 10, 25), eMajor.COMPSI,"343 E Main St, Newark, DE, 19711", "(334)-444-4440", "JAZ@Udel.edu"));
			
		}


	@Test
	public void test() {
		int credits = 0;
		
		int StudentNumber = 0;
		double Grades = 0;
		
		for(Enrollment e: StudentEnroll);{
			StudentNumber +=1;
			Grades += e.getGrade();
			
			for (course c: StudentCourse) {
				credits+= c.getGradePoint();
			}
			
		
		}
	}
}