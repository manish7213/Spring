package com.manish.springBoot.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepositories repositories;

	/*private List<course> courses=new ArrayList<course>(Arrays.asList(new course("java", "core java", "core java Description"),
			new course("Spring core","Spring core","spring core description"),
			new course("ORM","Hibernate","Basic Hibernate")
			));*/

	public List<Course> getAllCourses(String topicId){
		List<Course> courses= new ArrayList<>();
		repositories.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id){

		return repositories.findOne(id);
	}

	public void addCourse(Course course) {
		repositories.save(course);
		//courses.add(course);


	}

	public void updateCourse(Course course) {
		
		
			repositories.save(course);

	}

	public void deleteCourse(String id) {
		repositories.delete(id);

	}
}
