package com.api.models.repository;

import java.util.List;
import java.util.UUID;

import com.api.models.entity.Mahasiswa;

import org.springframework.data.repository.CrudRepository;

// page and short repository dan jpa juga macam"
public interface MahasiswaRepo extends CrudRepository<Mahasiswa, UUID> {
    List<Mahasiswa> findByNamaContains(String namas);
}
