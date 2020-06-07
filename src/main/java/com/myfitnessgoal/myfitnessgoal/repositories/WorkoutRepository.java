package com.myfitnessgoal.myfitnessgoal.repositories;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {
    
}