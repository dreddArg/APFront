import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RedesSociales } from '../model/redes-sociales';

@Injectable({
  providedIn: 'root'
})
export class RedesSocialesService {

  url:string = 'http://localhost:8080/api/redessociales/';
  getRedesSociales:string = 'get/';

  constructor(private http: HttpClient) { }

  obtenerRedesSociales():Observable<RedesSociales[]> {
    return this.http.get<RedesSociales[]>(this.url+this.getRedesSociales);
  }
  
}
