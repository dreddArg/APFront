import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PortfolioService } from 'src/app/servicios/portfolio.service';
import { TokenService } from 'src/app/servicios/token.service';

@Component({
  selector: 'app-barra',
  templateUrl: './barra.component.html',
  styleUrls: ['./barra.component.css']
})
export class BarraComponent implements OnInit {
  isLogged = false;
  datosWeb:any;
  redesSociales:any;

  constructor(private datosPortfolio:PortfolioService, private router:Router, private tokenService: TokenService) { }

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

    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  onLogOut():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  login(){
    this.router.navigate(['/login'])
  }
}
