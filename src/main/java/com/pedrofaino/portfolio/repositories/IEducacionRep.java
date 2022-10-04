package com.pedrofaino.portfolio.repositories;

import com.pedrofaino.portfolio.models.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRep extends JpaRepository<Educacion,Integer> {
    public Optional<Educacion> findByNombreEdu(String nombreEdu);
    public boolean existsByNombreEdu (String NombreEdu);
}
