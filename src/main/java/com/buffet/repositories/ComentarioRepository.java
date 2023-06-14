package com.buffet.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buffet.models.ComentarioModel;

@Repository
public interface ComentarioRepository extends CrudRepository<ComentarioModel, Long>{
    
}
