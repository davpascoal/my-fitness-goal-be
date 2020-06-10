package com.myfitnessgoal.myfitnessgoal.user.repository;

import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.user.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String emailAddress);

    // Collection<User> findAllByFirstNameLike(String )
}