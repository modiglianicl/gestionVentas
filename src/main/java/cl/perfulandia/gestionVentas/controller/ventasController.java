package cl.perfulandia.gestionVentas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/ventas")
public class ventasController {

    @GetMapping("/")
    public HashMap mostrarVentas(){
        HashMap<Integer, String> ventas = new HashMap<>();
        int contador = 1;
        for (int i = 0; i < 5000; i++) {
            ventas.put(contador, "Venta " + contador);
            contador++;
        }

        return ventas;
    }

}
