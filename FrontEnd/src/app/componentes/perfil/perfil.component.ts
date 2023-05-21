import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent {
  miPerfil:any;

  constructor(private datosPerfil:PortfolioService) { }

  ngOnInit(): void {
    this.datosPerfil.obtenerDatosPerfil().subscribe(dataPerfil =>{  
      this.miPerfil = dataPerfil;
    });
  }
}
