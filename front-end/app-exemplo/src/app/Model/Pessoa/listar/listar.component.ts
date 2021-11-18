import { Component, OnInit } from '@angular/core';
import { ServicoService } from '../../../Service/servico.service';
import { Pessoa } from '../entidade/Pessoa';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html'
})
export class ListarComponent implements OnInit{

  pessoa: Pessoa[] = [];
  constructor(private service: ServicoService){ }

  ngOnInit(){
      this.service.getPessoa()
      .subscribe(data => {
        this.pessoa = data;
      })
    }

}
