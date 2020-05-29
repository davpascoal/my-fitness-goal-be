package com.myfitnessgoal.myfitnessgoal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workout {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="workout_id")
    private int workoutId;
    
    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="bg_img")
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

    public Workout() {}

    public Workout(String title, String description, String bgImg) {
        this.title = title;
        this.description = description;
        this.bgImg = bgImg;
    }

    @Override
    public String toString() {
        return "Workout [bgImg=" + bgImg + ", description=" + description + ", title=" + title + ", workoutId="
                + workoutId + "]";
    }

}