package com.example.h2zoo.repositories;

import com.example.h2zoo.models.Bird;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepo extends CrudRepository<Bird, Long> {}
