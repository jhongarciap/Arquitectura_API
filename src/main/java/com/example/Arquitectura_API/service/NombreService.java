package com.example.Arquitectura_API.service;

import com.example.Arquitectura_API.model.AgifyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NombreService {

    public AgifyResponse obtenerEdadEstimadayContador(String nombre) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.agify.io?name=" + nombre;
        return restTemplate.getForObject(url, AgifyResponse.class);
    }
}

