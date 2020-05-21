package com.myfitnessgoal.myfitnessgoal.controller;

import java.util.ArrayList;
import java.util.List;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WorkoutController {
    
    @GetMapping("/workouts")
    @ResponseBody
    public List<Workout> getWorkouts() {
        List<Workout> fakeData = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            fakeData.add(new Workout(
                i, 
                "My Workout " + i, 
                "My description " + i,
                "https://images.unsplash.com/photo-1584735935682-2f2b69dff9d2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3302&q=80"
            ));
        }
        
        return fakeData;
    }
}