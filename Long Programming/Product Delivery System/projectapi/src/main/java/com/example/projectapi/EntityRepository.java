package com.example.projectapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<EntityClass, Long> {
}
