import { Formato } from './../model/formato';
import { ResponsavelEcr } from './../model/responsavelEcr';
import { TipoDocumento } from './../model/tipoDocumento';
import { Status } from './../model/status';
import { Disciplina } from './../model/disciplina';
import { Cliente } from 'src/model/cliente';
import { Controle } from '../model/controle';
import { Injectable } from '@angular/core';
import {
  HttpClient,
  HttpErrorResponse,
  HttpHeaders,
} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { Projeto } from 'src/model/projeto';

@Injectable({
  providedIn: 'root',
})
export class ControleProjetosService {
  URL_PATH = 'http://localhost:8080/cdp/';
  URL_CONTROLE = this.URL_PATH + 'controle';
  URL_PROJETO = this.URL_PATH + 'projeto';
  URL_CLIENTE = this.URL_PATH + 'cliente';
  URL_DISCIPLINA = this.URL_PATH + 'disciplina';
  URL_STATUS = this.URL_PATH + 'status';
  URL_TIPO_DOCUMENTTO = this.URL_PATH + 'tipoDocumento';
  URL_RESPONSAVEL_ECR = this.URL_PATH + 'responsavelEcr';
  URL_FORMATO = this.URL_PATH + 'formato';

  constructor(private httpClient: HttpClient) {}

  // Headers
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
  };

  // Obtem todos os controles
  getControles(): Observable<Controle[]> {
    return this.httpClient
      .get<Controle[]>(this.URL_CONTROLE)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os controles ordenado por Projeto, Cliente e Número Cliente Final
  getControlesOrdenadoPorProjetoClienteNumeroClienteFinal(): Observable<
    Controle[]
  > {
    return this.httpClient
      .get<Controle[]>(
        this.URL_CONTROLE +
          '/buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal'
      )
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os clientes ordenado por Projeto, Cliente e Número Cliente ou ECR
  buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr(): Observable<
    Controle[]
  > {
    return this.httpClient
      .get<Controle[]>(
        this.URL_CONTROLE +
          '/buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr'
      )
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem um cliente pelo id
  getControleById(id: number): Observable<Controle> {
    return this.httpClient
      .get<Controle>(this.URL_CONTROLE + '/' + id)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os projetos
  getProjetos(): Observable<Projeto[]> {
    return this.httpClient
      .get<Projeto[]>(this.URL_PROJETO)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os clientes
  getClientes(): Observable<Cliente[]> {
    return this.httpClient
      .get<Cliente[]>(this.URL_CLIENTE)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todas as disciplinas
  getDisciplinas(): Observable<Disciplina[]> {
    return this.httpClient
      .get<Disciplina[]>(this.URL_DISCIPLINA)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os status
  getStatus(): Observable<Status[]> {
    return this.httpClient
      .get<Status[]>(this.URL_STATUS)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os tipos de documentos
  getTipoDocumentos(): Observable<TipoDocumento[]> {
    return this.httpClient
      .get<TipoDocumento[]>(this.URL_TIPO_DOCUMENTTO)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os responsáveis ECR
  getResponsaveisEcr(): Observable<ResponsavelEcr[]> {
    return this.httpClient
      .get<ResponsavelEcr[]>(this.URL_RESPONSAVEL_ECR)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Obtem todos os formatos
  getFormatos(): Observable<Formato[]> {
    return this.httpClient
      .get<Formato[]>(this.URL_FORMATO)
      .pipe(retry(2), catchError(this.handleError));
  }

  // Manipulação de erros
  handleError(error: HttpErrorResponse) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // Erro ocorreu no lado do client
      errorMessage = error.error.message;
    } else {
      // Erro ocorreu no lado do servidor
      errorMessage =
        `Código do erro: ${error.status}, ` + `menssagem: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }
}
