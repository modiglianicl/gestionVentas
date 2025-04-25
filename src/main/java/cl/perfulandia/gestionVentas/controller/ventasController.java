package cl.perfulandia.gestionVentas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ventasController {
    HashMap<Integer, String> ventas = new HashMap<>();
    HashMap<Integer,String> ventasRealizadas = new HashMap<>();

    @GetMapping("/ventas")
    public HashMap mostrarVentas(){

        int contador = 1;
        for (int i = 0; i < 5000; i++) {
            ventas.put(contador, "Venta " + contador);
            contador++;
        }

        return ventas;
    }

    @PostMapping("/ventas")
    public HashMap crearVenta(){

        int contador = 1;
        for (int i = 0; i < 5000; i++) {
            ventasRealizadas.put(1,"Venta " + contador + "realizada por POST!");
            contador++;
        }

        return ventasRealizadas;
    }

}
