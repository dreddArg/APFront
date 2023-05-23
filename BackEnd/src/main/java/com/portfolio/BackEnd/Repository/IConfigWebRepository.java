package com.portfolio.BackEnd.Repository;

import com.portfolio.BackEnd.Entity.ConfigWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfigWebRepository extends JpaRepository<ConfigWeb, Long>{
    
}
