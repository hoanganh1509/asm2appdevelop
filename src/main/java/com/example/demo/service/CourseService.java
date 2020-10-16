package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> saveAllCourse(List<Course> courseList){
        return courseRepository.saveAll(courseList);
    }

    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }

    public Course getCourseById(int courseId){
        return courseRepository.findById(courseId).orElse(null);
    }

    public int deleteCourse(int courseId){
        courseRepository.deleteById(courseId);
        return courseId;
    }

    public Course updateCourse(Course course){
        Course oldCourse = courseRepository.findById(course.getCourseId()).orElse(null);
        oldCourse.setCourseName(course.getCourseName());
        oldCourse.setCourseName(course.getCourseName());
        oldCourse.setCategoryId(course.getCourseId());
        return courseRepository.save(oldCourse);
    }
}
