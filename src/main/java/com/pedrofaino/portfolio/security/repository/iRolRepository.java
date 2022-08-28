package com.pedrofaino.portfolio.security.repository;

import com.pedrofaino.portfolio.security.entity.Rol;
import com.pedrofaino.portfolio.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}