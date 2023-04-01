package com.bolsadeideas.springboot.web.app.controller;

import com.bolsadeideas.springboot.web.app.models.service.IServicio;
import com.bolsadeideas.springboot.web.app.models.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private IServicio servicio;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("titulo", servicio.operacion());
        return "index";
    }
}
