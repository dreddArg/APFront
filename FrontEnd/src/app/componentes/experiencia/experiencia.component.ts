import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent {
  datosWeb:any;
  miPortfolio:any;
  experiencia:any;

  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatosWeb().subscribe(data =>{
      //console.log(data);
      this.datosWeb = data[0];
      //this.redesSociales = data.redesSociales;
      // console.log(this.redesSociales)
    });
    
    this.datosPortfolio.obtenerExperiencia().subscribe(data => {
      this.experiencia = data;
    });
  }
}
