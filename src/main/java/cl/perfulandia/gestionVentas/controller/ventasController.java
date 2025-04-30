package cl.perfulandia.gestionVentas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1")
public class ventasController {
    private HashMap<Integer, String> ventas = new HashMap<>();

    @GetMapping("/ventas")
    public HashMap mostrarVentas(){

        return ventas;
    }

    @PostMapping("/ventas")
    public HashMap crearVenta(){
        int contador = ventas.size() + 1;
        ventas.put(contador,"Venta realizada a traves del post, esta venta es la numero " + contador);

        return ventas;
    }


}
