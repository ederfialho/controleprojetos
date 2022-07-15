import { Component, OnInit, ViewChild } from '@angular/core';
import { PrimeNGConfig, MessageService, SelectItem, ConfirmationService } from 'primeng/api';
import { Cliente } from 'src/model/cliente';
import { Controle } from 'src/model/controle';
import { ControleProjetosService } from 'src/services/controle-projetos.service';
import { Table } from 'primeng/table';
import { Projeto } from 'src/model/projeto';

@Component({
  selector: 'app-tabela-principal',
  templateUrl: './tabela-principal.component.html',
  providers: [MessageService,ConfirmationService],
  styles: [`
      :host ::ng-deep
      .aprovado {
        background-color: #076e0b !important;
        color: white !important;
      }
      .emitido {
        background-color: #a6f5aa !important;
      }
      .emElaboracao {
        background-color: #f7f7a1 !important;
      }
      .emAtendimentoDeComentario {
        background-color: #fad178 !important;
      }
  `
  ],
  styleUrls: ['./tabela-principal.component.scss']

})
export class TabelaPrincipalComponent implements OnInit {
  @ViewChild(Table)
  private table!: Table;
  controleDialog: boolean = false;
  submitted: boolean = false;

  cliente = {} as Cliente;
  controle = {} as Controle;
  projeto = {} as Projeto;

  clientes: Cliente[] = [];
  controles: Controle[] = [];
  controles2: Controle[] = [];
  projetos: Projeto[] = [];

  loading: boolean = true;

  controleClonado: { [s: string]: Controle } = {};
  listaProjetos: SelectItem[] = [];

  constructor(
    private primengConfig: PrimeNGConfig,
    private controleProjetosService: ControleProjetosService,
    private confirmationService: ConfirmationService,
    private messageService: MessageService
  ) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
    this.getControles();
    this.getProjetos();
  }

  resetSort() {
    this.table.sortOrder = 1;
    this.table.sortField = 'myDefaultSortColumnName';
    this.table.reset();
  }

  getControles() {
    this.controleProjetosService
      .getControles()
      .subscribe((controles: Controle[]) => {
        this.controles = controles;
        this.controles2 = controles;
      });
  }

  getProjetos() {
    this.controleProjetosService
      .getProjetos()
      .subscribe((projetos: Projeto[]) => {
        this.projetos = projetos;
        this.prrencheListaProjetos();
      });
  }

  prrencheListaProjetos() {
    this.projetos.forEach((proj) => {
      let lp = {} as SelectItem;
      lp.label = proj.nomeProjeto;
      lp.value = proj.id;
      this.listaProjetos.push(lp);
    });
  }

  botaoOrdenar(botao: string) {
    this.resetSort();
    if (botao === 'final') {
      this.getControlesOrdenadoPorProjetoClienteNumeroClienteFinal();
    } else {
      this.buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr();
    }
  }

  getControlesOrdenadoPorProjetoClienteNumeroClienteFinal() {
    this.controleProjetosService
      .getControlesOrdenadoPorProjetoClienteNumeroClienteFinal()
      .subscribe((con: Controle[]) => {
        this.controles = con;
        this.controles = this.controles.slice();
      });
  }

  buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr() {
    this.controleProjetosService
      .buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr()
      .subscribe((con: Controle[]) => {
        this.controles = con;
        this.controles = this.controles.slice();
      });
  }

  //Funções dos botões de Editar Tabela
  editProduct(controle: Controle) {
    this.controle = { ...controle };
    this.controleDialog = true;
  }

  openNew() {
    this.controle = {} as Controle;
    this.submitted = false;
    this.controleDialog = true;
}

hideDialog() {
  this.controleDialog = false;
  this.submitted = false;
}

saveProduct() {
      this.submitted = true;
      //this.controle = [...this.controle];
      this.controleDialog = false;
      this.controle = {} as Controle;
      console.log("SALVEI!!!!!");
  }

  deletarControle(controle: Controle) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar do controle de Nº CLIENTE FINAL ' + controle.numeroClienteFinal + ' e Nº CLIENTE OU ECR '+ controle.numeroClienteOuEcr+ '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.controles = this.controles.filter(val => val.id !== controle.id);
            this.controle = {} as Controle;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Controle Deletado', life: 3000});
        }
    });
  }

}
