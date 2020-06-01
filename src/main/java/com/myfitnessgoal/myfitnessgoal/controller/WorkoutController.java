package com.myfitnessgoal.myfitnessgoal.controller;

import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;
import com.myfitnessgoal.myfitnessgoal.services.WorkoutService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorkoutController {

    @Autowired
    WorkoutService service;

    @GetMapping("/workouts")
    @ResponseBody
    public List<Workout> getWorkouts() {
        return service.getAll();
    }

    // @PostMapping("/workout")
    // @ResponseBody
    // public Workout saveWorkout(@RequestBody Workout newWorkout) {
    //     return service.save(newWorkout);
    // }

    // @GetMapping("/workout/?/exerciselist")
    // public List<>

}