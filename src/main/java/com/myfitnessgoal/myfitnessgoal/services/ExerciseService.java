package com.myfitnessgoal.myfitnessgoal.services;

import java.util.ArrayList;
import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;
import com.myfitnessgoal.myfitnessgoal.repositories.ExerciseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    ExerciseRepository repository;

    public <S extends Exercise> S save(S entity) {
        return repository.save(entity);
    }

    public List<Exercise> getAll() {
        final List<Exercise> exercises = new ArrayList<>();
        
        for (Exercise exercise : repository.findAll()) {
            System.out.println("???" + exercise.getDuration().toMinutes());
            exercises.add(exercise);
        }
        
        // repository.findAll().forEach(exercise -> exercises.add(exercise));
        
        
        
        return exercises;
    }

}