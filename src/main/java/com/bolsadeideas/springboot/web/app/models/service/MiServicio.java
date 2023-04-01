package com.bolsadeideas.springboot.web.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante";
    }

    @Override
    public String devaluacion() {
        return "Has obtenido un bonus por tu desempeño";
    }
}
