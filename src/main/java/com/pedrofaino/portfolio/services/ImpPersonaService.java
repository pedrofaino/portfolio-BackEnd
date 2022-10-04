package com.pedrofaino.portfolio.services;

import com.pedrofaino.portfolio.Interface.IPersonaService;
import com.pedrofaino.portfolio.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pedrofaino.portfolio.repositories.IPersonaRep;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired
    IPersonaRep iPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = iPersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }

}
