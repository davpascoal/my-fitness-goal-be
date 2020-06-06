package com.myfitnessgoal.myfitnessgoal.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.myfitnessgoal.myfitnessgoal.dao.ExerciseDAOImpl;
import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    ExerciseDAOImpl exerciseDAO;

    @Override
    @Transactional
    public List<Exercise> findAll() {
        return exerciseDAO.findAll();
    }
    
    @Override
    @Transactional
    public Optional<Exercise> findById(int id) {
        return exerciseDAO.findById(id);
    }
    
    @Override
    @Transactional
    public void save(Exercise exercise) {
        exerciseDAO.save(exercise);
    }
    
    @Override
    @Transactional
    public void deleteById(int id) {
        exerciseDAO.deleteById(id);
    }
    
}