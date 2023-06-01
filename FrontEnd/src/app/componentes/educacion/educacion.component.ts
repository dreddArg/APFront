import { Component } from '@angular/core';
import { DatosWeb } from 'src/app/model/datos-web';
import { DatosWebService } from 'src/app/servicios/datos-web.service';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent {

  datosWeb: DatosWeb = new DatosWeb("", "", "", "", "", "", "", "","","", 0);
  educacion:any;

  constructor(private datosWebService: DatosWebService, private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosWebService.obtenerDatosWeb().subscribe(data =>{
      this.datosWeb = data;
    });
    
    this.datosPortfolio.obtenerDatos().subscribe(data =>{
      // console.log(data);
      this.educacion = data.educacion;
      // console.log(this.redesSociales)
    });
  }
}
