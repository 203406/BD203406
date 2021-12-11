package com.example.BD203406.Controller;

import com.example.BD203406.Model.Cita;
import com.example.BD203406.Repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaController {

    @Autowired
    CitaRepository citaRepository;

    @GetMapping(value = "/listCita")
    public List<Cita> getListCita() {
        return citaRepository.findAll();
    }
}
