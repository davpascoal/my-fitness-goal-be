package com.myfitnessgoal.myfitnessgoal.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.myfitnessgoal.myfitnessgoal.entity.Workout;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WorkoutDAOImpl implements WorkoutDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public WorkoutDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Workout> findAll() {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Workout> query = currentSession.createQuery("from Workout", Workout.class);

        // execute query and return result list
        return query.getResultList();

    }

    @Override
    public Optional<Workout> findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return Optional.ofNullable(currentSession.get(Workout.class, id));
    }
    
    @Override
    public void save(Workout workout) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(workout);
    }
    
    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Workout> query = currentSession.createQuery("delete from Workout where id = :workoutId");
        query.setParameter("workoutId", id);
        query.executeUpdate();
    }
    
}