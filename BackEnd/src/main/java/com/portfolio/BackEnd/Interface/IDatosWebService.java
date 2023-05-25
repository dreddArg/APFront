package com.portfolio.BackEnd.Interface;

import com.portfolio.BackEnd.Entity.DatosWeb;
import java.util.List;

public interface IDatosWebService {
    
    public List<DatosWeb> getDatosWeb ();
    
    public void saveDatosWeb(DatosWeb datosWeb);
}
