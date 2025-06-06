package com.example.Arquitectura_API.controller;


import com.example.Arquitectura_API.dto.ComparacionRequest;
import com.example.Arquitectura_API.dto.ComparacionResponse;
import com.example.Arquitectura_API.model.AgifyResponse;
import com.example.Arquitectura_API.service.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nombres")
public class NombreController {

    @Autowired
    private NombreService nombreService;

    @GetMapping("/edad")
    public AgifyResponse obtenerEdad(@RequestParam String nombre) {
        return nombreService.obtenerEdadEstimadayContador(nombre);
    }

    @PostMapping("/comparar")
    public ComparacionResponse compararEdad(@RequestBody ComparacionRequest request) {
        AgifyResponse respuesta = nombreService.obtenerEdadEstimadayContador(request.getNombre());

        ComparacionResponse resultado = new ComparacionResponse();
        resultado.setNombre(respuesta.getName());
        resultado.setEdadEstimada(respuesta.getAge());
        resultado.setEdadReal(request.getEdadReal());
        resultado.setAcerto(respuesta.getAge() == request.getEdadReal());

        return resultado;
    }
}
