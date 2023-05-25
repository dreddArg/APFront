package com.portfolio.BackEnd.Controller;

import com.portfolio.BackEnd.Entity.DatosWeb;
import com.portfolio.BackEnd.Interface.IDatosWebService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class DatosWebController {
    @Autowired IDatosWebService iDatosWebService;
    
    @GetMapping("api/getdatosweb")
    private List<DatosWeb> getDatosWeb(){
        return iDatosWebService.getDatosWeb();
    }
    
    @PostMapping("api/savedatosweb")
    private void saveDatosWeb(@RequestBody DatosWeb datosWeb){
        iDatosWebService.saveDatosWeb(datosWeb);
    }
}
