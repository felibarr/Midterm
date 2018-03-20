package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> s = new ArrayList();
	
	@BeforeClass
	public static void setup() throws PersonException{
		
		Staff staff1 = new Staff("fName", "mName", "lName", new Date(2000,7,1), "addy", "1234567890", "email", "office", 0, 15, new Date(), eTitle.MR);
		Staff staff2 = new Staff("fName", "mName", "lName", new Date(2000,7,1), "addy", "1234567890", "email", "office", 0, 20, new Date(), eTitle.MR);
		Staff staff3 = new Staff("fName", "mName", "lName", new Date(2000,7,1), "addy", "1234567890", "email", "office", 0, 10, new Date(), eTitle.MR);
		Staff staff4 = new Staff("fName", "mName", "lName", new Date(2000,7,1), "addy", "1234567890", "email", "office", 0, 17, new Date(), eTitle.MR);
		Staff staff5 = new Staff("fName", "mName", "lName", new Date(2000,7,1), "addy", "1234567890", "email", "office", 0, 13, new Date(), eTitle.MR);
		
		s.add(staff1);
		s.add(staff2);
		s.add(staff3);
		s.add(staff4);
		s.add(staff5);
		
	}
	
	@Test
	public void test() {
		int avg = (int) ((s.get(0).getSalary() + s.get(1).getSalary() + s.get(2).getSalary() + s.get(3).getSalary() + s.get(4).getSalary())/5);
		
		assertEquals(avg,15);

	}

}
