package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "trainer")
public class Trainer {
    private int trainerId;
    private String trainerName;
    private int userId;
    private String exterOrInter;
    private String education;
    private String workingPlace;
    private String telephone;
    private String traineRcol;
    private String email;

    @Id
    @Column(name = "TRAINER_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "TRAINER_NAME", nullable = false, length = 50)
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
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
    @Column(name = "EXTER_OR_INTER", nullable = false, length = 45)
    public String getExterOrInter() {
        return exterOrInter;
    }

    public void setExterOrInter(String exterOrInter) {
        this.exterOrInter = exterOrInter;
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
    @Column(name = "WORKING_PLACE", nullable = false, length = 45)
    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = false, length = 11)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "TRAINERcol", nullable = false, length = 45)
    public String getTraineRcol() {
        return traineRcol;
    }

    public void setTraineRcol(String traineRcol) {
        this.traineRcol = traineRcol;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
