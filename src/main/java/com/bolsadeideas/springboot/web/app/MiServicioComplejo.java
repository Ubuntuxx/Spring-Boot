package com.bolsadeideas.springboot.web.app;

import com.bolsadeideas.springboot.web.app.models.service.IServicio;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando algun proceso importante complicado";
    }
}
