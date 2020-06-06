package com.myfitnessgoal.myfitnessgoal.dao;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

public interface ExerciseDAO {
    public List<Exercise> findAll();

    public Optional<Exercise> findById(int id);

    public void save(Exercise exercise);

    public void deleteById(int id);
}