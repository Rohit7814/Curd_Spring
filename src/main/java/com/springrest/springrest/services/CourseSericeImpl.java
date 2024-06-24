package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;


@SuppressWarnings("unused")
@Service
public class CourseSericeImpl implements CourseService {

//	List<Course>list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseSericeImpl() {
//		list =new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","this course for java"));
//		list.add(new Course(445,"Spring boot Course","create Rest-Api"));

	}
	
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		
//		Course c=null;
//		
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;

	}


	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long parseLong) {
	@SuppressWarnings("deprecation")
	Course entity=courseDao.getOne(parseLong);
	courseDao.delete(entity);
	}
	
	

}
