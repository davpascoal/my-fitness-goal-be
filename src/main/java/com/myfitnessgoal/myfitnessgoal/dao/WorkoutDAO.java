package com.myfitnessgoal.myfitnessgoal.dao;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;

public interface WorkoutDAO {
    public List<Workout> findAll();

    public Optional<Workout> findById(int id);

    public void save(Workout workout);

    public void deleteById(int id);
}