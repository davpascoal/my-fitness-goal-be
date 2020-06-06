package com.myfitnessgoal.myfitnessgoal.services;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

public interface ExerciseService {
    public List<Exercise> findAll();
    public Optional<Exercise> findById(int id);
    public void save(Exercise exercise);
    public void deleteById(int id);
}