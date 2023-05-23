package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.ConfigWeb;
import java.util.List;

public interface IConfigWebService {
    // Trae config de la web actual
    public List<ConfigWeb> getConfigWeb();
    
    // Graba nueva config de la web
    public void saveConfigWeb(ConfigWeb configweb);
    
}
