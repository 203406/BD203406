package com.example.BD203406.Repository;

import com.example.BD203406.Model.Cita;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitaRepository extends CrudRepository<Cita, String> {
    List<Cita> findAll();
}
