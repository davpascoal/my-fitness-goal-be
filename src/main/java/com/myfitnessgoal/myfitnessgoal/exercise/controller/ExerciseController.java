package com.myfitnessgoal.myfitnessgoal.exercise.controller;

import java.util.List;

import com.myfitnessgoal.myfitnessgoal.exercise.entity.Exercise;
import com.myfitnessgoal.myfitnessgoal.exercise.service.ExerciseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    ExerciseServiceImpl service;

    @GetMapping("")
    public List<Exercise> getExercises() {
        return service.findAll();
    }
    
}