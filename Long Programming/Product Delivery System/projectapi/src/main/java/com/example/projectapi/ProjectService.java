package com.example.projectapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private EntityRepository  repo;

    public List<EntityClass> getAllstudents() {
        return repo.findAll();
    }

    public EntityClass save(EntityClass e) {
        return repo.save(e);
    }
}