import { Injectable } from '@angular/core';
import { HttpClient } from  '@angular/common/http';
import { Pessoa } from '../Model/entidade/Pessoa';

@Injectable({
  providedIn: 'root'
})
export class ServicoService {

  constructor(private http: HttpClient) { }

  urlBase = "http://localhost:8080/pessoa";

  getPessoa(){
    return this.http.get<Pessoa[]>(this.urlBase);
  }
}
