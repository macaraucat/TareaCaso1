package cl.duoc.tarea.controller;

import org.springframework.web.bind.annotation.RestController;
import cl.duoc.tarea.model.Producto;
import cl.duoc.tarea.service.ProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Producto>> listarProductos(){
        List<Producto> productos = prodService.obtenerTodos();
        return ResponseEntity.ok(productos);
    }
    
    @PostMapping
    public ResponseEntity<?> crearProducto(@RequestBody Producto p){
        try{
            return ResponseEntity.ok(prodService.guardarProducto(p));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProducto(@PathVariable int id){
        try{
            return ResponseEntity.ok(prodService.eliminarPorId(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}