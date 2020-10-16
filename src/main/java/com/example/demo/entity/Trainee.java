package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trainee")
public class Trainee {
    private int traineeId;
    private String traineeName;
    private int userId;
    private String traineeDob;
    private String education;
    private String proLanguage;
    private int toeicScore;
    private String exp;
    private String department;
    private String location;

    @Id
    @Column(name = "TRAINEE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    @Basic
    @Column(name = "TRAINEE_NAME", nullable = false, length = 50)
    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    @Basic
    @Column(name = "USER_ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "TRAINEE_DOB", nullable = false, length = 8)
    public String getTraineeDob() {
        return traineeDob;
    }

    public void setTraineeDob(String traineeDob) {
        this.traineeDob = traineeDob;
    }

    @Basic
    @Column(name = "EDUCATION", nullable = false, length = 45)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "PRO_LANGUAGE", nullable = false, length = 45)
    public String getProLanguage() {
        return proLanguage;
    }

    public void setProLanguage(String proLanguage) {
        this.proLanguage = proLanguage;
    }

    @Basic
    @Column(name = "TOEIC_SCORE", nullable = false)
    public int getToeicScore() {
        return toeicScore;
    }

    public void setToeicScore(int toeicScore) {
        this.toeicScore = toeicScore;
    }

    @Basic
    @Column(name = "EXP", nullable = false, length = 45)
    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = false, length = 45)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "LOCATION", nullable = false, length = 45)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
