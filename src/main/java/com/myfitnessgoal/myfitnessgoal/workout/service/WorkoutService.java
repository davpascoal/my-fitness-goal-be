package com.myfitnessgoal.myfitnessgoal.workout.service;
import com.myfitnessgoal.myfitnessgoal.workout.entity.Workout;

public interface WorkoutService {
    public Iterable<Workout> findAll();
    public Workout findById(Long id);
    public void save(Workout workout);
    public void deleteById(Long id);
}