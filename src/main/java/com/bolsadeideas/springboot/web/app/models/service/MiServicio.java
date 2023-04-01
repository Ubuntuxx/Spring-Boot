package com.bolsadeideas.springboot.web.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class MiServicio {
    public String operacion() {
        return "Ejecutando algun proceso importante";
    }
}
