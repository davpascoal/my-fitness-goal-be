package com.myfitnessgoal.myfitnessgoal.repositories;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
    
}