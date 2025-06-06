package com.example.Arquitectura_API.dto;

public class ComparacionRequest {
    private String nombre;
    private int edadReal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadReal() {
        return edadReal;
    }

    public void setEdadReal(int edadReal) {
        this.edadReal = edadReal;
    }
}
