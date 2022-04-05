package com.api.controller;

import com.api.models.entity.Mahasiswa;
import com.api.services.MahasiswaService;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @PostMapping("/saveMahasiswa")
    public Mahasiswa postDataAgent(@RequestBody String data_mahasiswa) {
        Mahasiswa mahasiswa = new Gson().fromJson(data_mahasiswa, Mahasiswa.class);
        System.out.println(mahasiswa.getUniversitas().size());
        System.out.println(mahasiswa.getUniversitas().get(0).getName_kampus());
        System.out.println("Data Mahasiswa");
        return mahasiswaService.saveDB(mahasiswa);
    }

}