package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	
	private UUID SemesterID;
	
	private UUID SectionID;
	
	private int RoomID;
	
	public Section(int RoomID) {
		this.CourseID = UUID.randomUUID();
		this.SemesterID = UUID.randomUUID();
		this.SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}
	
	

}
