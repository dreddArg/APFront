import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-barra',
  templateUrl: './barra.component.html',
  styleUrls: ['./barra.component.css']
})
export class BarraComponent {
  miPortfolio:any;
  redesSociales:any;

  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data =>{
      // console.log(data);
      this.miPortfolio = data;
      this.redesSociales = data.redesSociales;
      // console.log(this.redesSociales)
    });
  }
}
