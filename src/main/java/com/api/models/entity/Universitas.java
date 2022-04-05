package com.api.models.entity;

import java.io.Serializable;

import lombok.Data;

public @Data class Universitas implements Serializable {
    private String name_kampus;
    private String tahun;

    public Universitas(String name_kampus, String tahun) {
        this.name_kampus = name_kampus;
        this.tahun = tahun;
    }

}
