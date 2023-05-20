package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.Persona;
import com.portfolio.BackEnd.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaServ;
    
    @GetMapping("api/personas/{id}")
    public Persona datosPersona(@PathVariable Long id){
       // persona = ;
        return ipersonaServ.findPersona(id);
    }
    
    @GetMapping("personas/lista")
    public List<Persona> getPersona(){
        return ipersonaServ.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String savePersona(@RequestBody Persona persona){
        ipersonaServ.savePersona(persona);
        return "Persona creada.";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaServ.deletePersona(id);
        return "Persona borrada.";
    }
    
    @PutMapping("personas/editar/{id}")
    public String editPersona(@PathVariable Long id,
                              @RequestParam("nombre") String newnombre,
                              @RequestParam("bio") String newbio,
                              @RequestParam("longbio") String newlongbio,
                              @RequestParam("fotoPerfilUrl") String newfotoPerfilUrl
                              ){
        Persona newpersona = ipersonaServ.findPersona(id);
        newpersona.setNombre(newnombre);
        newpersona.setBio(newbio);
        newpersona.setLongBio(newlongbio);
        newpersona.setFotoPerfilUrl(newfotoPerfilUrl);
        
        ipersonaServ.savePersona(newpersona);
        
        return "Persona modificada.";
    }
    
}
