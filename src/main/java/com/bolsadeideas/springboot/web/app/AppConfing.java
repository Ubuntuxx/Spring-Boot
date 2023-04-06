package com.bolsadeideas.springboot.web.app;

import com.bolsadeideas.springboot.web.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.web.app.models.domain.Producto;
import com.bolsadeideas.springboot.web.app.models.service.IServicio;
import com.bolsadeideas.springboot.web.app.models.service.MiServicio;
import com.bolsadeideas.springboot.web.app.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfing {
    @Bean("miServicioSimple")
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto1 = new Producto("Monitor LG LCD 24'", 250);
        Producto producto2 = new Producto("Notebook ASUS", 500);
        Producto producto3 = new Producto("Impresora", 500);
        Producto producto4 = new Producto("Escritorio oficina", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 4);
        ItemFactura linea4 = new ItemFactura(producto4, 4);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
