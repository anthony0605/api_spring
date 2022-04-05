package com.api.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import com.api.models.entity.Mahasiswa;
import com.api.models.repository.MahasiswaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MahasiswaService {
    @Autowired
    private MahasiswaRepo mahasiswaRepo;

    @Async
    public Mahasiswa saveDB(Mahasiswa mahasiswa) {
        System.out.println(mahasiswa);
        return mahasiswaRepo.save(mahasiswa);
    }

    public Mahasiswa getDB(UUID uuid) {
        return mahasiswaRepo.findById(uuid).get();
    }

    public Iterable<Mahasiswa> getAllDB() {
        return mahasiswaRepo.findAll();
    }

    public void removeDB(UUID uuid) {
        mahasiswaRepo.deleteById(uuid);
    }

    public List<Mahasiswa> finByNama(String nama) {
        return mahasiswaRepo.findByNamaContains(nama);
    }
}
