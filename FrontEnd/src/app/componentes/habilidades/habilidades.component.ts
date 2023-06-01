import { Component } from '@angular/core';
import { DatosWeb } from 'src/app/model/datos-web';
import { DatosWebService } from 'src/app/servicios/datos-web.service';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-habilidades',
  templateUrl: './habilidades.component.html',
  styleUrls: ['./habilidades.component.css']
})
export class HabilidadesComponent {

  datosWeb: DatosWeb = new DatosWeb("", "", "", "", "", "", "", "","","", 0);
  habilidades:any;

  constructor(private datosWebService: DatosWebService, private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosWebService.obtenerDatosWeb().subscribe(data =>{
      this.datosWeb = data;
    });

    this.datosPortfolio.obtenerDatos().subscribe(data =>{
      // console.log(data);
      this.habilidades = data.habilidades;
      // console.log(this.redesSociales)
    });
  }
}
