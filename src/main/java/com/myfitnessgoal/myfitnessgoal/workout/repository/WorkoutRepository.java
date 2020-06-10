package com.myfitnessgoal.myfitnessgoal.workout.repository;

import com.myfitnessgoal.myfitnessgoal.workout.entity.Workout;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    Page<Workout> findAll(Pageable pageable);
}