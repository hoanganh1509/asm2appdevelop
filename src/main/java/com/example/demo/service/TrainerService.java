package com.example.demo.service;

import com.example.demo.entity.Trainer;
import com.example.demo.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    @Autowired
    private TrainerRepository trainerRepository;

    public Trainer saveTrainer(Trainer trainer){
        return trainerRepository.save(trainer);
    }

    public List<Trainer> saveAllTrainer(List<Trainer> trainerList){
        return trainerRepository.saveAll(trainerList);
    }

    public List<Trainer> getTrainer(){
        return trainerRepository.findAll();
    }

    public Trainer getTrainerById(int trainerId){
        return trainerRepository.findById(trainerId).orElse(null);
    }

    public int deleteTrainer(int trainerId){
        trainerRepository.deleteById(trainerId);
        return trainerId;
    }

    public Trainer updateTrainer(Trainer trainer){
        Trainer oldTrainer = trainerRepository.findById(trainer.getTrainerId()).orElse(null);
        oldTrainer.setTrainerName(trainer.getTrainerName());
        oldTrainer.setUserId(trainer.getUserId());
        oldTrainer.setExterOrInter(trainer.getExterOrInter());
        oldTrainer.setEducation(trainer.getEducation());
        oldTrainer.setWorkingPlace(trainer.getWorkingPlace());
        oldTrainer.setTelephone(trainer.getTelephone());
        oldTrainer.setTraineRcol(trainer.getTraineRcol());
        oldTrainer.setEmail(trainer.getEmail());
        return trainerRepository.save(oldTrainer);
    }
}
