package com.example.h2zoo.repositories;

import com.example.h2zoo.models.Reptile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReptileRepo extends CrudRepository<Reptile, Long> {}
