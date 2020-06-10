package com.myfitnessgoal.myfitnessgoal.exercise.repository;

import com.myfitnessgoal.myfitnessgoal.exercise.entity.Exercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
    
}