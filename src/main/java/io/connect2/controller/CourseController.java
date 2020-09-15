package io.connect2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.connect2.model.Course;
import io.connect2.dto.CourseDto;
import io.connect2.service.CourseService;

@CrossOrigin("*")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public void addCourse(@RequestBody CourseDto courseDto) {
		courseService.addCourse(courseDto);
	}
	
	@GetMapping("/courses")
	public List<Course> viewAllCourses(){
		return courseService.getAllCourses();
	}
	
	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	
	@GetMapping("course/{id}")
	public CourseDto searchCourse(@PathVariable String id) {
		return courseService.searchCourse(id);
	}
	
	@PutMapping("course/{id}")
	public void updateCourse(@RequestBody CourseDto courseDto,@PathVariable String id) {
		courseService.updateCourse(courseDto,id);
	}
	
}
