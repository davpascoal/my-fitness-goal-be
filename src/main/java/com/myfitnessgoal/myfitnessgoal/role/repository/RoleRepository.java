package com.myfitnessgoal.myfitnessgoal.role.repository;

import java.util.Optional;

import com.myfitnessgoal.myfitnessgoal.role.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByType(String name);
}