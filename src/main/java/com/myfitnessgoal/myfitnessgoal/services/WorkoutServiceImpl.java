package com.myfitnessgoal.myfitnessgoal.services;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.dao.WorkoutDAOImpl;
import com.myfitnessgoal.myfitnessgoal.entity.Workout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    
    @Autowired
    WorkoutDAOImpl workoutDAO;

    @Override
    @Transactional
    public List<Workout> findAll() {
        return workoutDAO.findAll();
    }
    
    @Override
    @Transactional
    public Optional<Workout> findById(int id) {
        return workoutDAO.findById(id);
    }
    
    @Override
    @Transactional
    public void save(Workout workout) {
        workoutDAO.save(workout);
    }
    
    @Override
    @Transactional
    public void deleteById(int id) {
        workoutDAO.deleteById(id);
    }

}