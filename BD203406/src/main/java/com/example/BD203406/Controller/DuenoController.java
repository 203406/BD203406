package com.example.BD203406.Controller;


import com.example.BD203406.Model.Dueno;
import com.example.BD203406.Repository.DuenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenoController {

    @Autowired
    DuenoRepository duenoRepository;

    @GetMapping(value = "/listDueño")
    public List<Dueno> getListDueno(){
        return duenoRepository.findAll();
    }
}

