package com.example.projectapi;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/entities")
public class EntityController {

    private final ProjectService Service;

    public EntityController(ProjectService service) {
        Service = service;
    }


    @GetMapping
    public List<EntityClass> getAll() {
        return Service.getAllstudents();
    }

    @PostMapping
    public EntityClass create(@RequestBody EntityClass entity) {
        return Service.save(entity);
    }

}
