package com.myfitnessgoal.myfitnessgoal.repositories;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Integer> {
    
}