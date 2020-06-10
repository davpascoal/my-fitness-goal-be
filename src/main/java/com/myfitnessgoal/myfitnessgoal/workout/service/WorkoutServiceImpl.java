package com.myfitnessgoal.myfitnessgoal.workout.service;

import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.workout.entity.Workout;
import com.myfitnessgoal.myfitnessgoal.workout.repository.WorkoutRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    
    @Autowired
    private WorkoutRepository workoutRepository;

    Pageable page = PageRequest.of(0, 20);

    @Override
    public Iterable<Workout> findAll() {
        return workoutRepository.findAll(page);
    }
    
    @Override
    public Workout findById(Long id) {
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
    public void deleteById(Long id) {
        workoutRepository.deleteById(id);
    }

}