import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {

  url:string = 'http://localhost:8080/api/';
  getDatosWeb:string = 'getdatosweb/';
  getRedesSociales:string = 'getredessociales/';

  constructor(private http:HttpClient) { }

  obtenerDatosWeb():Observable<any> {
    return this.http.get(this.url+this.getDatosWeb);
  }

  obtenerRedesSociales():Observable<any> {
    return this.http.get(this.url+this.getRedesSociales);
  }

  obtenerDatos():Observable<any> { 
    return this.http.get('/assets/data/data.json');
    //return this.http.get(this.url+"personas/1");
  }

  obtenerDatosPerfil():Observable<any> { 
    //return this.http.get('/assets/data/data.json');
    return this.http.get(this.url+"personas/1");
  }
}
