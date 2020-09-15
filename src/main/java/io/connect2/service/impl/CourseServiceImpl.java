package io.connect2.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.connect2.model.Course;
import io.connect2.dto.CourseDto;
import io.connect2.repository.CourseRepository;
import io.connect2.service.CourseService;

@RestController
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Transactional
	public void addCourse(CourseDto courseDto) {
		Course course = new Course();
		BeanUtils.copyProperties(courseDto, course);
		courseRepository.save(course);

	}

	@Transactional
	public void updateCourse(CourseDto courseDto, String id) {
		Course course = new Course();
		BeanUtils.copyProperties(courseDto, course);
		courseRepository.save(course);

	}

	@Transactional
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);

	}

	@Transactional
	public CourseDto searchCourse(String id) {
		CourseDto courseDto = new CourseDto();
		Course course=new Course();
		course=courseRepository.findById(id).get();
		BeanUtils.copyProperties(course, courseDto);
		return courseDto;

	}

	@Transactional
	public List<Course> getAllCourses() {
		List<Course> courseList = new ArrayList<Course>();
		//List<CourseDto> courseDtoList = new ArrayList<CourseDto>();
		courseRepository.findAll().forEach(courseList::add);
		return courseList;
		/*for (int i = 0; i < courseList.size(); i++) {
			BeanUtils.copyProperties(courseList.get(i), courseDtoList.get(i));
		}
		return courseDtoList;*/
	}

}
