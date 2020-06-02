package com.myfitnessgoal.myfitnessgoal.controller;

import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;
import com.myfitnessgoal.myfitnessgoal.services.ExerciseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController {

    @Autowired
    ExerciseService service;

    @GetMapping("/exercises")
    public List<Exercise> getExercises() {
        return service.getAll();
    }
    
}