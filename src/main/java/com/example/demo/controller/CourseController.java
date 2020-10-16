package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService ;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @PostMapping("/addCourseList")
    public List<Course> addAllCourse(@RequestBody List<Course> courseList){
        return courseService.saveAllCourse(courseList);
    }

    @GetMapping("/getAllCourse")
    public List<Course> findAllCategory(){
        return courseService.getAllCourse();
    }

    @GetMapping("/getCourse/{courseId}")
    public Course findById(@PathVariable int courseId){
        return courseService.getCourseById(courseId);
    }

    @PutMapping("/updateCourse")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{courseId}")
    public int deleteCourse(@PathVariable int courseId){
        return courseService.deleteCourse(courseId);
    }
}
