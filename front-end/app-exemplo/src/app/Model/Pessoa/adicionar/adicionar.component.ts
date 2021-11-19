import { Component, OnInit } from '@angular/core';
import { ServicoService } from '../../../Service/servico.service';
import { Router } from '@angular/router';
import { Pessoa } from '../../entidade/Pessoa';

@Component({
  selector: 'app-adicionar',
  templateUrl: './adicionar.component.html'
})
export class AdicionarComponent implements OnInit {

  pessoa: Pessoa = new Pessoa();
  constructor(private service: ServicoService, private router: Router) { }

  ngOnInit(): void {
  }

  addPessoa(){
    this.service.addPessoa(this.pessoa)
    .subscribe(data => {
      alert('Cadastrado com sucesso');
      this.router.navigate(["listar"]);
  })
  }

}
