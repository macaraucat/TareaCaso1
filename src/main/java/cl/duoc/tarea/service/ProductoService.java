package cl.duoc.tarea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.tarea.model.Producto;
import cl.duoc.tarea.repository.ProductoRepository;

@Service
public class ProductoService {

    private ProductoRepository prodRepo;

    public List<Producto> obtenerTodos(){
        return prodRepo.findAll();
    }

    public Producto guardarProducto(Producto p){
        return prodRepo.save(p);
    }

    public String eliminarPorId(int id){
        prodRepo.deleteById(id);
        return "Producto eliminado";
    }

}
