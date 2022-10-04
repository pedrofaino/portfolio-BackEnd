
package com.pedrofaino.portfolio.repositories;

import com.pedrofaino.portfolio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRep extends JpaRepository<Persona,Long>{
    
}
