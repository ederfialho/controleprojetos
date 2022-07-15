import { Formato } from './../../../model/formato';
import { ResponsavelEcr } from './../../../model/responsavelEcr';
import { TipoDocumento } from './../../../model/tipoDocumento';
import { Status } from './../../../model/status';
import { Disciplina } from './../../../model/disciplina';
import { Cliente } from 'src/model/cliente';
import { Component, OnInit, ViewChild } from '@angular/core';
import { ConfirmationService, FilterMatchMode, FilterService, Message, MessageService, PrimeNGConfig, SelectItem } from 'primeng/api';
import { Projeto } from 'src/model/projeto';
import { ControleProjetosService } from 'src/services/controle-projetos.service';
import { Table } from 'primeng/table';

@Component({
  selector: 'app-listas-suspensas',
  templateUrl: './listas-suspensas.component.html',
  styleUrls: ['./listas-suspensas.component.scss'],
  providers: [MessageService,ConfirmationService]
})
export class ListasSuspensasComponent implements OnInit {
  @ViewChild('editarProjeto') editarProjetos: Table | undefined;
  @ViewChild('editarCliente') editarClientes: Table | undefined;
  @ViewChild('editarDisciplina') editarDisciplinas: Table | undefined;
  @ViewChild('editarStatus') editarStatuss: Table | undefined;
  @ViewChild('editarTipoDocumento') editarTipoDocumentos: Table | undefined;
  @ViewChild('editarResponsavelEcr') editarResponsavelEcrs: Table | undefined;
  msgs: Message[] = [];
  matchModeOptions: SelectItem[] = [];

  projetoDialog: boolean = false;
  projetoDialogEditar: boolean = false;
  clienteDialog: boolean = false;
  clienteDialogEditar: boolean = false;
  disciplinaDialog: boolean = false;
  disciplinaDialogEditar: boolean = false;
  statusDialog: boolean = false;
  statusDialogEditar: boolean = false;
  tipoDocumentoDialog: boolean = false;
  tipoDocumentoDialogEditar: boolean = false;
  responsavelEcrDialog: boolean = false;
  responsavelEcrDialogEditar: boolean = false;
  formatoDialog: boolean = false;
  formatoDialogEditar: boolean = false;


  submitted: boolean = false;

  //Variáveis das Listas Suspensas
  projeto = {} as Projeto;
  cliente = {} as Cliente;
  disciplina = {} as Disciplina;
  status = {} as Status;
  tipoDocumento = {} as TipoDocumento;
  responsavelEcr = {} as ResponsavelEcr;
  formato = {} as Formato;

  //Listas das Listas Suspensas
  projetos: Projeto[] = [];
  clientes: Cliente[] = [];
  disciplinas: Disciplina[] = [];
  statuss: Status[] = [];
  tipoDocumentos: TipoDocumento[] = [];
  responsavelEcrs: ResponsavelEcr[] = [];
  formatos: Formato[] = [];

  constructor(
    private primengConfig: PrimeNGConfig,
    private confirmationService: ConfirmationService,
    private messageService: MessageService,
    private filterService: FilterService,
    private controleProjetosService: ControleProjetosService
  ) { }

  ngOnInit(): void {
    this.getProjetos();
    this.getClientes();
    this.getDisciplinas();
    this.getStatus();
    this.getTipoDocumentos();
    this.getResponsaveisEcr();
    this.getFormatos();

    this.iniciarFiltro();
  }

  iniciarFiltro() {
    this.matchModeOptions = [
      { label: "Começa com", value: FilterMatchMode.STARTS_WITH },
      { label: "Termina com", value: FilterMatchMode.ENDS_WITH },
      { label: "Contém", value: FilterMatchMode.CONTAINS },
      { label: "Não contém", value: FilterMatchMode.NOT_CONTAINS },
      { label: "Diferente de", value: FilterMatchMode.EQUALS },
      { label: "Igual a", value: FilterMatchMode.EQUALS }
    ]
  }

  // Métodos de busca de dados usando o Service
  getProjetos() {
    this.controleProjetosService
      .getProjetos()
      .subscribe((projetos: Projeto[]) => {
        this.projetos = projetos;
      });
  }

  getClientes() {
    this.controleProjetosService
      .getClientes()
      .subscribe((clientes: Cliente[]) => {
        this.clientes = clientes;
      });
  }

  getDisciplinas() {
    this.controleProjetosService
      .getDisciplinas()
      .subscribe((disciplinas: Disciplina[]) => {
        this.disciplinas  = disciplinas ;
      });
  }

  getStatus() {
    this.controleProjetosService
      .getStatus()
      .subscribe((listaStatus: Status[]) => {
        this.statuss = listaStatus;
      });
  }

  getTipoDocumentos() {
    this.controleProjetosService
      .getTipoDocumentos()
      .subscribe((tipoDocumentos: TipoDocumento[]) => {
        this.tipoDocumentos = tipoDocumentos;
      });
  }

  getResponsaveisEcr() {
    this.controleProjetosService
      .getResponsaveisEcr()
      .subscribe((responsavelEcrs: ResponsavelEcr[]) => {
        this.responsavelEcrs = responsavelEcrs;
      });
  }

  getFormatos() {
    this.controleProjetosService
      .getFormatos()
      .subscribe((formatos: Formato[]) => {
        this.formatos = formatos;
      });
  }

  //Métodos para gerenciamento de Projetos
  abreNovoProjeto() {
    this.projeto = {} as Projeto;
    this.submitted = false;
    this.projetoDialog = true;
  }

  editarProjeto(projeto: Projeto) {
    this.projeto = { ...projeto };
    this.projetoDialogEditar = true;
  }

  deletarProjeto(projeto: Projeto) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + projeto.nomeProjeto + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.projetos = this.projetos.filter(val => val.id !== projeto.id);
            this.projeto = {} as Projeto;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Projeto Deletado', life: 3000});
        }
    });
  }

  fecharProjetoDialogEditar() {
    this.projetoDialogEditar = false;
    this.submitted = false;
  }

  fecharProjetoDialog() {
    this.projetoDialog = false;
    this.submitted = false;
  }

  salvarProjetoEditado() {
    this.submitted = true;
    if (this.projeto.nomeProjeto.trim()) {
        if (this.projeto.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Projeto Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.projetos.push(this.projeto);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Projeto Criado', life: 3000});
        }

        this.projetos = [...this.projetos];
        this.projetoDialogEditar = false;
        this.projeto = {} as Projeto;
    }
  }

  salvarNovoProjeto() {
    this.submitted = true;
    this.projeto.id = this.projetos.length+1;
    console.log(this.projeto.id);
    this.projetos.push(this.projeto);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Projeto Criado', life: 3000});

    this.projetos = [...this.projetos];
    this.projetoDialog = false;
    this.projeto = {} as Projeto;
  }

  //Métodos para gerenciamento de Clientes
  abreNovoCliente() {
    this.cliente = {} as Cliente;
    this.submitted = false;
    this.clienteDialog = true;
  }

  editarCliente(cliente: Cliente) {
    this.cliente = { ...cliente };
    this.clienteDialogEditar = true;
  }

  deletarCliente(cliente: Cliente) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + cliente.nomeCliente + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.clientes = this.clientes.filter(val => val.id !== cliente.id);
            this.cliente = {} as Cliente;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Cliente Deletado', life: 3000});
        }
    });
  }

  fecharClienteDialogEditar() {
    this.clienteDialogEditar = false;
    this.submitted = false;
  }

  fecharClienteDialog() {
    this.clienteDialog = false;
    this.submitted = false;
  }

  salvarClienteEditado() {
    this.submitted = true;
    if (this.cliente.nomeCliente.trim()) {
        if (this.cliente.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Cliente Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.clientes.push(this.cliente);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Cliente Criado', life: 3000});
        }

        this.clientes = [...this.clientes];
        this.clienteDialogEditar = false;
        this.cliente = {} as Cliente;
    }
  }

  salvarNovoCliente() {
    this.submitted = true;
    this.cliente.id = this.clientes.length+1;
    this.clientes.push(this.cliente);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Cliente Criado', life: 3000});

    this.clientes = [...this.clientes];
    this.clienteDialog = false;
    this.cliente = {} as Cliente;
  }

  //Métodos para gerenciamento de Disciplinas
  abreNovaDisciplina() {
    this.disciplina = {} as Disciplina;
    this.submitted = false;
    this.disciplinaDialog = true;
  }

  editarDisciplina(disciplina: Disciplina) {
    this.disciplina = { ...disciplina };
    this.disciplinaDialogEditar = true;
  }

  deletarDisciplina(disciplina: Disciplina) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + disciplina.nomeDisciplina + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.disciplinas = this.disciplinas.filter(val => val.id !== disciplina.id);
            this.disciplina = {} as Disciplina;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Disciplina Deletada', life: 3000});
        }
    });
  }

  fecharDisciplinaDialogEditar() {
    this.disciplinaDialogEditar = false;
    this.submitted = false;
  }

  fecharDisciplinaDialog() {
    this.disciplinaDialog = false;
    this.submitted = false;
  }

  salvarDisciplinaEditado() {
    this.submitted = true;
    if (this.disciplina.nomeDisciplina.trim()) {
        if (this.disciplina.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Disciplina Atualizada', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.disciplinas.push(this.disciplina);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Disciplina Criada', life: 3000});
        }

        this.disciplinas = [...this.disciplinas];
        this.disciplinaDialogEditar = false;
        this.disciplina = {} as Disciplina;
    }
  }

  salvarNovaDisciplina() {
    this.submitted = true;
    this.disciplina.id = this.disciplinas.length+1;
    this.disciplinas.push(this.disciplina);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Disciplina Criada', life: 3000});

    this.disciplinas = [...this.disciplinas];
    this.disciplinaDialog = false;
    this.disciplina = {} as Disciplina;
  }

  //Métodos para gerenciamento de Status
  abreNovoStatus() {
    this.status = {} as Status;
    this.submitted = false;
    this.statusDialog = true;
  }

  editarStatus(status: Status) {
    this.status = { ...status };
    this.statusDialogEditar = true;
  }

  deletarStatus(status: Status) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + status.nomeStatus + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.statuss = this.statuss.filter(val => val.id !== status.id);
            this.status = {} as Status;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Status Deletado', life: 3000});
        }
    });
  }

  fecharStatusDialogEditar() {
    this.statusDialogEditar = false;
    this.submitted = false;
  }

  fecharStatusDialog() {
    this.statusDialog = false;
    this.submitted = false;
  }

  salvarStatusEditado() {
    this.submitted = true;
    if (this.status.nomeStatus.trim()) {
        if (this.status.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Status Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.statuss.push(this.status);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Status Criado', life: 3000});
        }

        this.statuss = [...this.statuss];
        this.statusDialogEditar = false;
        this.status = {} as Status;
    }
  }

  salvarNovoStatus() {
    this.submitted = true;
    this.status.id = this.statuss.length+1;
    this.statuss.push(this.status);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Status Criado', life: 3000});

    this.statuss = [...this.statuss];
    this.statusDialog = false;
    this.status = {} as Status;
  }

  //Métodos para gerenciamento de Status
  abreNovoTipoDocumento() {
    this.tipoDocumento = {} as TipoDocumento;
    this.submitted = false;
    this.tipoDocumentoDialog = true;
  }

  editarTipoDocumento(tipoDocumento: TipoDocumento) {
    this.tipoDocumento = { ...tipoDocumento };
    this.tipoDocumentoDialogEditar = true;
  }

  deletarTipoDocumento(tipoDocumento: TipoDocumento) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + tipoDocumento.nomeTipoDocumento + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.tipoDocumentos = this.tipoDocumentos.filter(val => val.id !== tipoDocumento.id);
            this.tipoDocumento = {} as TipoDocumento;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Status Deletado', life: 3000});
        }
    });
  }

  fecharTipoDocumentoDialogEditar() {
    this.tipoDocumentoDialogEditar = false;
    this.submitted = false;
  }

  fecharTipoDocumentoDialog() {
    this.tipoDocumentoDialog = false;
    this.submitted = false;
  }

  salvarTipoDocumentoEditado() {
    this.submitted = true;
    if (this.tipoDocumento.nomeTipoDocumento.trim()) {
        if (this.tipoDocumento.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Tipo de Documento Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.tipoDocumentos.push(this.tipoDocumento);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Tipo de Documento Criado', life: 3000});
        }

        this.tipoDocumentos = [...this.tipoDocumentos];
        this.tipoDocumentoDialogEditar = false;
        this.tipoDocumento = {} as TipoDocumento;
    }
  }

  salvarNovoTipoDocumento() {
    this.submitted = true;
    this.tipoDocumento.id = this.tipoDocumentos.length+1;
    this.tipoDocumentos.push(this.tipoDocumento);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Tipo de Documento Criado', life: 3000});

    this.tipoDocumentos = [...this.tipoDocumentos];
    this.tipoDocumentoDialog = false;
    this.tipoDocumento = {} as TipoDocumento;
  }

  //Métodos para gerenciamento de Responsável ECR
  abreNovoResponsavelEcr() {
    this.responsavelEcr = {} as ResponsavelEcr;
    this.submitted = false;
    this.responsavelEcrDialog = true;
  }

  editarResponsavelEcr(responsavelEcr: ResponsavelEcr) {
    this.responsavelEcr = { ...responsavelEcr };
    this.responsavelEcrDialogEditar = true;
  }

  deletarResponsavelEcr(responsavelEcr: ResponsavelEcr) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + responsavelEcr.nomeResponsavelEcr + '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.responsavelEcrs = this.responsavelEcrs.filter(val => val.id !== responsavelEcr.id);
            this.responsavelEcr = {} as ResponsavelEcr;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Responsável ECR Deletado', life: 3000});
        }
    });
  }

  fecharResponsavelEcrDialogEditar() {
    this.responsavelEcrDialogEditar = false;
    this.submitted = false;
  }

  fecharResponsavelEcrDialog() {
    this.responsavelEcrDialog = false;
    this.submitted = false;
  }

  salvarResponsavelEcrEditado() {
    this.submitted = true;
    if (this.responsavelEcr.nomeResponsavelEcr.trim()) {
        if (this.responsavelEcr.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Responsável ECR Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.responsavelEcrs.push(this.responsavelEcr);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Responsável ECR Criado', life: 3000});
        }

        this.responsavelEcrs = [...this.responsavelEcrs];
        this.responsavelEcrDialogEditar = false;
        this.responsavelEcr = {} as ResponsavelEcr;
    }
  }

  salvarNovoResponsavelEcr() {
    this.submitted = true;
    this.responsavelEcr.id = this.responsavelEcrs.length+1;
    this.responsavelEcrs.push(this.responsavelEcr);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Responsável ECR Criado', life: 3000});

    this.responsavelEcrs = [...this.responsavelEcrs];
    this.responsavelEcrDialog = false;
    this.responsavelEcr = {} as ResponsavelEcr;
  }

  //Métodos para gerenciamento de Formato
  abreNovoFormato() {
    this.formato = {} as Formato;
    this.submitted = false;
    this.formatoDialog = true;
  }

  editarFormato(formato: Formato) {
    this.formato = { ...formato };
    this.formatoDialogEditar = true;
  }

  deletarFormato(formato: Formato) {
    this.confirmationService.confirm({
        message: 'Esta operação é irreversível. Tem certeza que deseja deletar ' + formato.nomeFormato+ '?',
        header: 'Confirmar',
        icon: 'pi pi-exclamation-triangle',
        acceptLabel: 'SIM',
        rejectLabel: 'NÃO',
        accept: () => {
            this.formatos = this.formatos.filter(val => val.id !== formato.id);
            this.formato = {} as Formato;
            this.messageService.add({severity:'success', summary: 'Succeso', detail: 'Formato Deletado', life: 3000});
        }
    });
  }

  fecharFormatoDialogEditar() {
    this.formatoDialogEditar = false;
    this.submitted = false;
  }

  fecharFormatoDialog() {
    this.formatoDialog = false;
    this.submitted = false;
  }

  salvarFormatoEditado() {
    this.submitted = true;
    if (this.formato.nomeFormato.trim()) {
        if (this.formato.id) {
            this.messageService.add({severity:'success', summary: 'Sucesso!', detail: 'Formato Atualizado', life: 3000});
        }
        else {
            //this.projeto.id = this.createId();
            this.formatos.push(this.formato);
            this.messageService.add({severity:'success', summary: 'Successful', detail: 'Formato Criado', life: 3000});
        }

        this.formatos = [...this.formatos];
        this.formatoDialogEditar = false;
        this.formato = {} as Formato;
    }
  }

  salvarNovoFormato() {
    this.submitted = true;
    this.responsavelEcr.id = this.responsavelEcrs.length+1;
    this.responsavelEcrs.push(this.responsavelEcr);
    this.messageService.add({severity:'success', summary: 'Successful', detail: 'Responsável ECR Criado', life: 3000});

    this.responsavelEcrs = [...this.responsavelEcrs];
    this.responsavelEcrDialog = false;
    this.responsavelEcr = {} as ResponsavelEcr;
  }
}
