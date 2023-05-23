package com.portfolio.BackEnd.Service;

import com.portfolio.BackEnd.Entity.ConfigWeb;
import com.portfolio.BackEnd.Interface.IConfigWebService;
import com.portfolio.BackEnd.Repository.IConfigWebRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpConfigWebService implements IConfigWebService {
    
    @Autowired
    public IConfigWebRepository iconfigWebRepository;

    @Override
    public List<ConfigWeb> getConfigWeb() {
        return iconfigWebRepository.findAll();
    }

    @Override
    public void saveConfigWeb(ConfigWeb configweb) {
        iconfigWebRepository.save(configweb);
    }
    
    
}
