
package com.pedrofaino.portfolio.repository;

import com.pedrofaino.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRep extends JpaRepository<Persona,Long>{
    
}
