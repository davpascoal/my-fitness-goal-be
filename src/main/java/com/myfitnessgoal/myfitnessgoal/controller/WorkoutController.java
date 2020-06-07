package com.myfitnessgoal.myfitnessgoal.controller;

import java.util.List;
import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;
import com.myfitnessgoal.myfitnessgoal.services.WorkoutService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    WorkoutService service;

    @GetMapping("")
    public List<Workout> getWorkouts() {
        return service.findAll();
    }

    @GetMapping("/{workoutId}")
    public Workout getWorkout(@PathVariable int workoutId) {
        Workout workout = service.findById(workoutId);

        if (workout == null) {
            throw new RuntimeException("Workout id not found - " + workoutId);
        }

        return workout;
    }

    @PostMapping("")
    public Workout saveWorkout(@RequestBody Workout workout) {
        workout.setWorkoutId(0);
        service.save(workout);
        return workout;
    }

    @PutMapping("")
    public Workout updatedWorkout(@RequestBody Workout workout) {
        service.save(workout);
        return workout;
    }

    @DeleteMapping("/{id}")
    public String deleteWorkout(@PathVariable int id) {
        Workout workout = service.findById(id);

        if (workout == null) {
            throw new RuntimeException("Workout id not found - " + id);
        }

        service.deleteById(id);
        return "Deleted Workout id - " + id;
    }

}