package io.connect2.service;

import java.util.List;

import io.connect2.model.Course;
import io.connect2.dto.CourseDto;

public interface CourseService {
	public void addCourse(CourseDto courseDto);
	public void updateCourse(CourseDto courseDto ,String id);
	public void deleteCourse(String id);
	public CourseDto searchCourse(String id);
	public List<Course> getAllCourses();
}
