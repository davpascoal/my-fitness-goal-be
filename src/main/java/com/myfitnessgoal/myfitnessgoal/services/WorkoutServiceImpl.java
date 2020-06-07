package com.myfitnessgoal.myfitnessgoal.services;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;
import com.myfitnessgoal.myfitnessgoal.repositories.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    
    private WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutServiceImpl(WorkoutRepository theWorkoutRepository) {
        workoutRepository = theWorkoutRepository;
    }

    @Override
    public List<Workout> findAll() {
        return workoutRepository.findAll();
    }
    
    @Override
    public Workout findById(int id) {
        Optional<Workout> result = workoutRepository.findById(id);

        if (!result.isPresent()) {
            throw new RuntimeException("Did not find workout id - " + id);
        }

        return result.get();
    }
    
    @Override
    public void save(Workout workout) {
        workoutRepository.save(workout);
    }
    
    @Override
    public void deleteById(int id) {
        workoutRepository.deleteById(id);
    }

}