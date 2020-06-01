package com.myfitnessgoal.myfitnessgoal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class WorkoutExerciseId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "workout_id")
    private Long workoutId;

    @Column(name = "exercise_id")
    private Long exerciseId;

    public WorkoutExerciseId() {
    }

    public WorkoutExerciseId(Long workoutId, Long exerciseId) {
        this.workoutId = workoutId;
        this.exerciseId = exerciseId;
    }

    public Long getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Long workoutId) {
        this.workoutId = workoutId;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((exerciseId == null) ? 0 : exerciseId.hashCode());
        result = prime * result + ((workoutId == null) ? 0 : workoutId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkoutExerciseId other = (WorkoutExerciseId) obj;
        if (exerciseId == null) {
            if (other.exerciseId != null)
                return false;
        } else if (!exerciseId.equals(other.exerciseId))
            return false;
        if (workoutId == null) {
            if (other.workoutId != null)
                return false;
        } else if (!workoutId.equals(other.workoutId))
            return false;
        return true;
    }

}