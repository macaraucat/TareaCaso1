package cl.duoc.tarea.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.duoc.tarea.model.Producto;

@Repository
public class ProductoRepository {

    private List<Producto> productos = new ArrayList<>();

    public ProductoRepository(){
        productos.add(new Producto(1, "El Quijote de la Mancha", 50000, "libro"));
        productos.add(new Producto(2, "Enciclopedia de animales salvajes", 20000, "enciclopedia"));
        productos.add(new Producto(3, "Ecos del mundo literario", 10000, "revista"));
    }

    public List<Producto> findAll(){
        return productos;
    }

    public Producto save(Producto p){
        productos.add(p);
        return p;
    }

    public void deleteById(int id){
        productos.removeIf(p -> p.getId() == id);
    }

}
