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
    private Long id;
    
    @NotNull
    private Long personaActiva_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonaActiva_id() {
        return personaActiva_id;
    }

    public void setPersonaActiva_id(Long personaActiva_id) {
        this.personaActiva_id = personaActiva_id;
    }
    
    
}
