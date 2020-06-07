package com.myfitnessgoal.myfitnessgoal.repositories;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
    
}