package cl.perfulandia.gestionVentas.model;

import lombok.Data;

@Data
public class Producto {
    
    private Long id;
    private String nombreProducto;
    private Float precio;

}
