package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "course")
public class Course {
    private int courseId;
    private String courseName;
    private int categoryId;
    private String discription;

    @Id
    @Column(name = "COURSE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "COURSE_NAME", nullable = false, length = 30)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "CATEGORY_ID", nullable = false)
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "DISCRIPTION", nullable = false, length = 45)
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

}
