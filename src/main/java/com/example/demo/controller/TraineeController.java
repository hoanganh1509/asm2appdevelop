package com.example.demo.controller;

import com.example.demo.entity.Trainee;
import com.example.demo.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TraineeController {
    @Autowired
    private TraineeService traineeService;

    @PostMapping("/addTrainee")
    public Trainee addTrainee(@RequestBody Trainee trainee){
        return traineeService.saveTrainee(trainee);
    }

    @PostMapping("/addTraineeList")
    public List<Trainee> addAllTrainee(@RequestBody List<Trainee> traineeList){
        return traineeService.saveAllTrainee(traineeList);
    }

    @GetMapping("/getAllTrainee")
    public List<Trainee> findAllTrainee(){
        return traineeService.getTrainee();
    }

    @GetMapping("/getTrainee/{traineeId}")
    public Trainee findById(@PathVariable int traineeId){
        return traineeService.getTraineeById(traineeId);
    }

    @PutMapping("/updateTrainee")
    public Trainee updateTrainee(@RequestBody Trainee trainee){
        return traineeService.updateTrainee(trainee);
    }

    @DeleteMapping("/deleteTrainee/{traineeId}")
    public int deleteTrainee(@PathVariable int traineeId){
        return traineeService.deleteTrainee(traineeId);
    }
}
