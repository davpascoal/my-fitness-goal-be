package com.myfitnessgoal.myfitnessgoal.entity;

import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private int exerciseId;
    
    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "duration")
    Duration duration;

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Exercise() {}

    public Exercise(String exerciseName, Duration duration) {
        this.exerciseName = exerciseName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Exercise [duration=" + duration + ", exerciseId=" + exerciseId + ", exerciseName=" + exerciseName + "]";
    }

}