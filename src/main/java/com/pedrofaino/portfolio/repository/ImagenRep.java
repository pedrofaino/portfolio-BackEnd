package com.pedrofaino.portfolio.repository;

import com.pedrofaino.portfolio.model.Imagen;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRep extends JpaRepository<Imagen,Integer>{
    List<Imagen>findByOrderById();
}
