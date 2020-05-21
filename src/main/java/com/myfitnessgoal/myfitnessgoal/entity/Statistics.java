// package com.myfitnessgoal.myfitnessgoal.entity;

// import java.time.Duration;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name="statistics")
// public class Statistics {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "statistics_id")
//     private int statisticsId;

//     @Column(name = "total_time")
//     private Duration totalTime;
    
//     @Column(name = "total_calories")
//     private int totalCalories;
    
//     @Column(name = "total_workouts")
//     private int totalWorkouts;
    
//     @Column(name = "total_exercises")
//     private int totalExercises;

//     public Statistics() {
        
//     }

//     public Statistics(int statisticsId, Duration totalTime, int totalCalories, int totalWorkouts, int totalExercises) {
//         this.statisticsId = statisticsId;
//         this.totalTime = totalTime;
//         this.totalCalories = totalCalories;
//         this.totalWorkouts = totalWorkouts;
//         this.totalExercises = totalExercises;
//     }

//     public int getStatisticsId() {
//         return statisticsId;
//     }

//     public void setStatisticsId(int statisticsId) {
//         this.statisticsId = statisticsId;
//     }

//     public Duration getTotalTime() {
//         return totalTime;
//     }

//     public void setTotalTime(Duration totalTime) {
//         this.totalTime = totalTime;
//     }

//     public int getTotalCalories() {
//         return totalCalories;
//     }

//     public void setTotalCalories(int totalCalories) {
//         this.totalCalories = totalCalories;
//     }

//     public int getTotalWorkouts() {
//         return totalWorkouts;
//     }

//     public void setTotalWorkouts(int totalWorkouts) {
//         this.totalWorkouts = totalWorkouts;
//     }

//     public int getTotalExercises() {
//         return totalExercises;
//     }

//     public void setTotalExercises(int totalExercises) {
//         this.totalExercises = totalExercises;
//     }

//     @Override
//     public String toString() {
//         return "Statistics [statisticsId=" + statisticsId + ", totalCalories=" + totalCalories + ", totalExercises="
//                 + totalExercises + ", totalTime=" + totalTime + ", totalWorkouts=" + totalWorkouts + "]";
//     }

    
// }