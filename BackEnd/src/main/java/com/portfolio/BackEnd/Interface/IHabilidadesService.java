package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.Habilidades;
import java.util.List;
import java.util.Optional;

public interface IHabilidadesService {
    
    public List<Habilidades> getHabilidades();
    
    public Optional<Habilidades> getOneHabilidades(int id);
    
    public Optional<Habilidades> getByNombreHabilidades(String nombreHabilidades);
    
    public void saveHabilidades(Habilidades hab);
    
    public void deleteHabilidades(int id);
    
    public boolean existsById(int id);
    
    public boolean existsByNombreHabilidades(String nombreHabilidades);
}
