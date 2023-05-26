package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Experiencia;
import com.portfolio.BackEnd.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class ExperienciaController {
    
    @Autowired IExperienciaService iExperienciaService;
    
    @GetMapping("api/getexperiencia")
    public List<Experiencia> getExperiencia(){
        return iExperienciaService.getExperiencia();
    } 

    @PostMapping("api/saveexperiencia")
    public void saveExperiencia(@RequestBody Experiencia experiencia){
        iExperienciaService.saveExperiencia(experiencia);
    }
    
}
