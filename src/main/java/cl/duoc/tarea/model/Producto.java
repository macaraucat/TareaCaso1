package cl.duoc.tarea.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private String categoria;
}
