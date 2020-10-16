package com.example.demo.service;

import com.example.demo.entity.Trainee;
import com.example.demo.entity.Trainee;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    @Autowired
    private TraineeRepository traineeRepository;

    public Trainee saveTrainee(Trainee trainee){
        return traineeRepository.save(trainee);
    }

    public List<Trainee> saveAllTrainee(List<Trainee> traineeList){
        return traineeRepository.saveAll(traineeList);
    }

    public List<Trainee> getTrainee(){
        return traineeRepository.findAll();
    }

    public Trainee getTraineeById(int traineeId){
        return traineeRepository.findById(traineeId).orElse(null);
    }

    public int deleteTrainee(int traineeId){
        traineeRepository.deleteById(traineeId);
        return traineeId;
    }

    public Trainee updateTrainee(Trainee trainee){
        Trainee oldTrainee = traineeRepository.findById(trainee.getTraineeId()).orElse(null);
        oldTrainee.setTraineeName(trainee.getTraineeName());
        oldTrainee.setUserId(trainee.getUserId());
        oldTrainee.setTraineeDob(trainee.getTraineeDob());
        oldTrainee.setEducation(trainee.getEducation());
        oldTrainee.setProLanguage(trainee.getProLanguage());
        oldTrainee.setToeicScore(trainee.getToeicScore());
        oldTrainee.setExp(trainee.getExp());
        oldTrainee.setDepartment(trainee.getDepartment());
        oldTrainee.setLocation(trainee.getLocation());

        return traineeRepository.save(oldTrainee);
    }
}
