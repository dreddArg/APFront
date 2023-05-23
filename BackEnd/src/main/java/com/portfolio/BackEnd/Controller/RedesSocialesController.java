package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.RedesSociales;
import com.portfolio.BackEnd.Interface.IRedesSocialesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedesSocialesController {
    
    @Autowired IRedesSocialesService iRedesSocialesService;
    
    @GetMapping("api/redessociales")
    public List<RedesSociales> getRedesSociales(){
        return iRedesSocialesService.getRedesSociales();
    }
    
    @PostMapping("api/redessociales/graba")
    public void saveRedesSociales(@RequestBody RedesSociales redesSociales){
        iRedesSocialesService.saveRedesSociales(redesSociales);
    }
    
    
}
