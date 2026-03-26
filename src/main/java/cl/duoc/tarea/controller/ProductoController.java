package cl.duoc.tarea.controller;

import org.springframework.web.bind.annotation.RestController;
import cl.duoc.tarea.model.Producto;
import cl.duoc.tarea.service.ProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    private ProductoService prodService;

    @GetMapping
    public List<Producto> listarProductos(){
        return prodService.obtenerTodos();
    }
    
    @PostMapping
    public Producto crearProducto(@RequestBody Producto p){
        return prodService.guardarProducto(p);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id){
        return prodService.eliminarPorId(id);
    }

}
