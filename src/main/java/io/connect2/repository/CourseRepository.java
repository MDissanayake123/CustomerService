package io.connect2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.connect2.model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

}
