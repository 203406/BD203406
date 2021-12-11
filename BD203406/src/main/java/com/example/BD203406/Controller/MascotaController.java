package com.example.BD203406.Controller;


import com.example.BD203406.Model.Mascota;
import com.example.BD203406.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    MascotaRepository MascotaRepository;

    @GetMapping(value = "/listMascota")
    public List<Mascota> getListMascota() {
        return MascotaRepository.findAll();
    }

}
