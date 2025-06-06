package com.example.Arquitectura_API.dto;

public class ComparacionResponse {
    private String nombre;
    private int edadEstimada;
    private int edadReal;
    private boolean acerto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadEstimada() {
        return edadEstimada;
    }

    public void setEdadEstimada(int edadEstimada) {
        this.edadEstimada = edadEstimada;
    }

    public int getEdadReal() {
        return edadReal;
    }

    public void setEdadReal(int edadReal) {
        this.edadReal = edadReal;
    }

    public boolean isAcerto() {
        return acerto;
    }

    public void setAcerto(boolean acerto) {
        this.acerto = acerto;
    }
}
