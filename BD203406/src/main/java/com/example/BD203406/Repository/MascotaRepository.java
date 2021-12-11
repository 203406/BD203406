package com.example.BD203406.Repository;

import com.example.BD203406.Model.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MascotaRepository extends CrudRepository<Mascota, String> {
    List<Mascota> findAll();
}
