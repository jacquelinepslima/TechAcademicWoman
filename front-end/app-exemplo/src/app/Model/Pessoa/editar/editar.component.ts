import { Component, OnInit } from '@angular/core';
import { ServicoService } from '../../../Service/servico.service';
import { Pessoa } from '../../entidade/Pessoa';
import { Router } from '@angular/router';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html'
})
export class EditarComponent implements OnInit {

  pessoa: Pessoa = new Pessoa();
  constructor(private service: ServicoService, private router: Router) { }

  ngOnInit(): void {
    this.buscaPessoa();
  }

  buscaPessoa(){
    let idLocalStorage = localStorage.getItem("id");
    this.service.getPessoaById(idLocalStorage)
    .subscribe(data => {
      this.pessoa =data;
    })

    console.log(this.pessoa);
  }

  atualizarPessoa(){
    this.service.updatePessoa(this.pessoa)
    .subscribe(data => {
      this.pessoa = data;
      this.router.navigate(['listar']);
    })
  }

}
