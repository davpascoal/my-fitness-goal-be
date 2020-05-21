package com.myfitnessgoal.myfitnessgoal.entity;

// import javax.persistence.Entity;

// @Entity
public class Workout {

    private int workoutId;
    private String title;
    private String description;
    private String bgImg;

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBgImg() {
        return bgImg;
    }

    public void setBgImg(String bgImg) {
        this.bgImg = bgImg;
    }

    public Workout(int workoutId, String title, String description, String bgImg) {
        this.workoutId = workoutId;
        this.title = title;
        this.description = description;
        this.bgImg = bgImg;
    }

    
    
}