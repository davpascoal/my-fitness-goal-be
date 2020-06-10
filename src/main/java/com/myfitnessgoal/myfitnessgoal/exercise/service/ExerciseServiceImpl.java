package com.myfitnessgoal.myfitnessgoal.exercise.service;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.exercise.entity.Exercise;
import com.myfitnessgoal.myfitnessgoal.exercise.repository.ExerciseRepository;

import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> findAll() {
        return exerciseRepository.findAll();
    }
    
    @Override
    public Exercise findById(int id) {
        Optional<Exercise> result = exerciseRepository.findById(id);

        if (!result.isPresent()) {
            throw new RuntimeException("Did not find exercise id - " + id);
        }

        return result.get();
    }
    
    @Override
    public void save(Exercise exercise) {
        exerciseRepository.save(exercise);
    }
    
    @Override
    public void deleteById(int id) {
        exerciseRepository.deleteById(id);
    }
    
}