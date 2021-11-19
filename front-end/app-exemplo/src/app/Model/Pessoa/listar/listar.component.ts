import { Pessoa } from './../../entidade/Pessoa';
import { Component, OnInit } from '@angular/core';
import { ServicoService } from '../../../Service/servico.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html'
})
export class ListarComponent implements OnInit{

  listaPessoa: Pessoa[] = [];
  constructor(private service: ServicoService){ }

  ngOnInit(){
      this.service.getPessoa()
      .subscribe(data => {
        this.listaPessoa = data;
      })
    }

    editar(id: any): void{
      localStorage.setItem("id", id.toString());
    }
}
