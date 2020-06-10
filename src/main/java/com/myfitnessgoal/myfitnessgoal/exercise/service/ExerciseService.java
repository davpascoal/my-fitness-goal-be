package com.myfitnessgoal.myfitnessgoal.exercise.service;

import java.util.List;

import com.myfitnessgoal.myfitnessgoal.exercise.entity.Exercise;

public interface ExerciseService {
    public List<Exercise> findAll();
    public Exercise findById(int id);
    public void save(Exercise exercise);
    public void deleteById(int id);
}