package com.example.demo.repository;


import com.example.demo.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {
}
