package com.myfitnessgoal.myfitnessgoal.controller;

import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;
import com.myfitnessgoal.myfitnessgoal.services.ExerciseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExerciseController {

    @Autowired
    ExerciseService service;

    @GetMapping("/exercises")
    @ResponseBody
    public List<Exercise> getExercises() {
        return service.getAll();
    }
    
}