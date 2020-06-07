package com.myfitnessgoal.myfitnessgoal.services;

import java.util.List;
import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

public interface ExerciseService {
    public List<Exercise> findAll();
    public Exercise findById(int id);
    public void save(Exercise exercise);
    public void deleteById(int id);
}