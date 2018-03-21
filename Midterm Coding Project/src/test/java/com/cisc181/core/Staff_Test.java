package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static ArrayList<Staff> StaffList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() throws PersonException {
		StaffList.add(new Staff ("Aaron", "Yixuan", "Peng", new Date(1982,10,9), "157 E Main St, Newark, DE, 19711", "(333)-333-3333", "AYP@me.com", "M 10 - 12", 5, 1000.0, new Date(2008,9,1), eTitle.MR));
		StaffList.add(new Staff ("Bettina", "Yixuan", "Peng", new Date(1981,10,9), "158 E Main St, Newark, DE, 19711", "(333)-333-4444", "BYP@me.com", "Tu 10 - 12", 6, 2000.0, new Date(2007,9,1), eTitle.MRS));
		StaffList.add(new Staff ("Cathy", "Yixuan", "Peng", new Date(1980,10,9), "159 E Main St, Newark, DE, 19711", "(333)-333-5555", "CYP@me.com", "W 10 - 12", 7, 3000.0, new Date(2006,9,1), eTitle.MRS));
		StaffList.add(new Staff ("Debbie", "Yixuan", "Peng", new Date(1979,10,9), "160 E Main St, Newark, DE, 19711", "(333)-333-6666", "DYP@me.com", "Th 10 - 12", 8, 4000.0, new Date(2005,9,1), eTitle.MRS));
		StaffList.add(new Staff ("Erin", "Yixuan", "Peng", new Date(1978,10,9), "161 E Main St, Newark, DE, 19711", "(333)-333-7777", "EYP@me.com", "F 10 - 12", 9, 5000.0, new Date(2004,9,1), eTitle.MRS));
	}
	
	@Test
	public void test() {
		double TotalSalary = 0.0;
		for (Staff staff: StaffList) {
			TotalSalary = TotalSalary + staff.getSalary();
			
		}
		double Average = TotalSalary / StaffList.size();
		assertEquals(Average,3000,0.01);
		boolean throwException = false;
		try {
			Staff WN = new Staff("Aaron", "Yixuan", "Peng", new Date(1992,10,9), "157 E Main St, Newark, DE, 19711", "(333)-3333-333", "AYP@me.com", "M 10 - 12", 5, 1000.0, new Date(2008,9,1), eTitle.MR);
		}
		catch(PersonException e) {
			throwException = true;
			
		}
		assertTrue(throwException);
		boolean throwException2 = false;
		try {
			Staff WDOB = new Staff("Aaron", "Yixuan", "Peng", new Date(1792,10,9), "157 E Main St, Newark, DE, 19711", "(333)-3333-333", "AYP@me.com", "M 10 - 12", 5, 1000.0, new Date(2008,9,1), eTitle.MR);
		}
		catch(PersonException e) {
			throwException2 = true;
			
	}	
		assertTrue(throwException2);
	}
}

