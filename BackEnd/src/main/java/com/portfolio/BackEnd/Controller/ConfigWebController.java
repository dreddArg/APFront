package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.ConfigWeb;
import com.portfolio.BackEnd.Interface.IConfigWebService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")


@RestController
public class ConfigWebController {
    @Autowired IConfigWebService iconfigWebServ;
    
    @GetMapping("api/configweb")
    public List<ConfigWeb> getConfigWeb(){
       // persona = ;
        return iconfigWebServ.getConfigWeb();
    }
    
    @PostMapping("api/configweb/graba")
    public void saveConfigWeb(@RequestBody ConfigWeb configweb){
        iconfigWebServ.saveConfigWeb(configweb);
    }
}
