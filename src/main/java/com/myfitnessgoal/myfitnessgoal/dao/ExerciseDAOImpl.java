package com.myfitnessgoal.myfitnessgoal.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.myfitnessgoal.myfitnessgoal.entity.Exercise;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ExerciseDAOImpl implements ExerciseDAO {
    private EntityManager entityManager;

    @Autowired
    public ExerciseDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Exercise> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        
        Query<Exercise> query = currentSession.createQuery("from Exercise", Exercise.class);
        
        return query.getResultList();
    }
    
    @Override
    public Optional<Exercise> findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return Optional.ofNullable(currentSession.get(Exercise.class, id));    
    }
    
    @Override
    public void save(Exercise exercise) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(exercise);
    }
    
    @Override
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Exercise> query = currentSession.createQuery("delete from Exercise where id=:exerciseId", Exercise.class);
        query.setParameter("exerciseId", id);
        query.executeUpdate();
    }
}