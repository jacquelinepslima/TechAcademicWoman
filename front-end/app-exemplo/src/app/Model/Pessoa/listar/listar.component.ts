import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html'
})
export class ListarComponent {

  constructor(private router: Router){ }

  Listar(){
    this.router.navigate(['listar']);
  }

}
