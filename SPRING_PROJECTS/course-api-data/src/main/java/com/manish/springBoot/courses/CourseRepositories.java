package com.manish.springBoot.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositories extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	
	

}
