package com.example.BD203406.Repository;
import com.example.BD203406.Model.Dueno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenoRepository
        extends CrudRepository<Dueno, String> {
    List<Dueno> findAll();
}