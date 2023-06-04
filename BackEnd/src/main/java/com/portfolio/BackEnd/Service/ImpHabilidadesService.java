package com.portfolio.BackEnd.Service;

import com.portfolio.BackEnd.Entity.Habilidades;
import com.portfolio.BackEnd.Interface.IHabilidadesService;
import com.portfolio.BackEnd.Repository.IHabilidadesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpHabilidadesService implements IHabilidadesService {

    @Autowired
    public IHabilidadesRepository iHabilidadesRepository;
    
    @Override
    public List<Habilidades> getHabilidades() {
        return iHabilidadesRepository.findAll();
    }

    @Override
    public Optional<Habilidades> getOneHabilidades(int id) {
        return iHabilidadesRepository.findById(id);
    }

    @Override
    public Optional<Habilidades> getByNombreHabilidades(String nombreHabilidades) {
        return iHabilidadesRepository.findByNombreHabilidades(nombreHabilidades);
    }

    @Override
    public void saveHabilidades(Habilidades hab) {
        iHabilidadesRepository.save(hab);
    }

    @Override
    public void deleteHabilidades(int id) {
        iHabilidadesRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return iHabilidadesRepository.existsById(id);
    }

    @Override
    public boolean existsByNombreHabilidades(String nombreHabilidades) {
        return iHabilidadesRepository.existsByNombreHabilidades(nombreHabilidades);
    }
    
}
