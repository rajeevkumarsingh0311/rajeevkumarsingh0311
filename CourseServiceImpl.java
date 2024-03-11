package com.spring.spring.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.spring.spring.entity.Course;

@Service
@Configuration
public class CourseServiceImpl implements CourseService {
	@Autowired
 List<Course>list;
	public CourseServiceImpl() {
	

	
	list = new ArrayList<>();
	 list .add( new Course(145," java cotre courses", "  this   courses contains basic of java "));
	 list. add ( new Course(4343," spring boot courses" , "  creating rest api using rest  spring boot"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		 Course  c  = null;
		    
		    for (Course course : list) {
		    	if (course.getId() == courseId) {
		          c = course;
		         break;
		       }
		   }
		    
		   return  c ;
	}
}
		


