package com.portfolio.BackEnd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ConfigWeb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private Long personaActiva_id;

    //Contructor
    public ConfigWeb() {
    }

    public ConfigWeb(Long personaActiva_id) {
        this.personaActiva_id = personaActiva_id;
    }

    //Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getPersonaActiva_id() {
        return personaActiva_id;
    }

    public void setPersonaActiva_id(Long personaActiva_id) {
        this.personaActiva_id = personaActiva_id;
    }
    
    
}
