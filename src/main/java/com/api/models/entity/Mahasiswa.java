package com.api.models.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "mahasiswa")
public @Data class Mahasiswa implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    @Column(name = "nama", nullable = true)
    private String nama;
    double int_random = Math.random() * 10000;
    int randomNumber = (int) int_random;
    @Column(name = "nim", nullable = false, unique = true)
    private Integer nim = randomNumber;
    @Column(name = "alamat", nullable = true)
    private String alamat;

    private List<Universitas> universitas;

    public Mahasiswa() {
    }

    public Mahasiswa(UUID id, String nama, Integer nim, String alamat) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

}
