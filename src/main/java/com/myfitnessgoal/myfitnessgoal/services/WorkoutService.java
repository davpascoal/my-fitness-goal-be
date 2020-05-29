package com.myfitnessgoal.myfitnessgoal.services;

import java.util.ArrayList;
import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;
import com.myfitnessgoal.myfitnessgoal.repositories.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    
    @Autowired
    WorkoutRepository repository;

    public Workout save(final Workout workout) {
        return repository.save(workout);
    }

    public List<Workout> getAll() {
        final List<Workout> workouts = new ArrayList<>();
        repository.findAll().forEach(workout -> workouts.add(workout));
        return workouts;
    }
}