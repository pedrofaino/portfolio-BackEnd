package com.pedrofaino.portfolio.services;

import com.pedrofaino.portfolio.models.Imagen;
import com.pedrofaino.portfolio.repositories.ImagenRep;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImagenService {

    @Autowired
    ImagenRep imagenRep;

    public List<Imagen> list() {
        return imagenRep.findByOrderById();
    }
    
    public Optional<Imagen> getOne(int id){
        return imagenRep.findById(id);
    }

    public void save(Imagen imagen) {
        imagenRep.save(imagen);
    }

    public void delete(int id) {
        imagenRep.deleteById(id);
    }
    
    public boolean exists(int id){
        return imagenRep.existsById(id);
    }
    
}
