import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-barra',
  templateUrl: './barra.component.html',
  styleUrls: ['./barra.component.css']
})
export class BarraComponent {
  datosWeb:any;
  redesSociales:any;

  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatosWeb().subscribe(data =>{
      //console.log(data);
      this.datosWeb = data[0];
      //this.redesSociales = data.redesSociales;
      // console.log(this.redesSociales)
    });

    this.datosPortfolio.obtenerRedesSociales().subscribe(data => {
      this.redesSociales = data;
      //console.log(data);
    })
  }
}
