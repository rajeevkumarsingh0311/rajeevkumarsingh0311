package com.spring.spring.service;

import java.util.List;


import com.spring.spring.entity.Course;

public interface CourseService {
	public  List<Course>getCourses();
	public Course getCourse(long courseId);
	

}
