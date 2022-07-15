import { NgModule, DEFAULT_CURRENCY_CODE, LOCALE_ID, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

//Imports Components e Services do Projeto
import { ControleComponent } from './controle.component';
import { TabelaPrincipalComponent } from './tabela-principal/tabela-principal.component';
import { ListasSuspensasComponent } from './listas-suspensas/listas-suspensas.component';
import { ImportarArquivosComponent } from './importar-arquivos/importar-arquivos.component';
import { FileUploadModule } from 'ng2-file-upload';

// **************************************************
import ptBr from '@angular/common/locales/pt';
import { registerLocaleData } from '@angular/common';

registerLocaleData(ptBr);
// **************************************************

//Imports PrimeNG
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { FormsModule } from '@angular/forms';
import { PanelModule } from 'primeng/panel';
import { TableModule } from 'primeng/table';
import { TabViewModule } from 'primeng/tabview';
import { ToastModule } from 'primeng/toast';
import { DropdownModule } from 'primeng/dropdown';
import { DialogModule } from 'primeng/dialog';
import { AccordionModule } from 'primeng/accordion';
import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { MessagesModule } from 'primeng/messages';

@NgModule({
  declarations: [
    ControleComponent,
    TabelaPrincipalComponent,
    ListasSuspensasComponent,
    ImportarArquivosComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    TableModule,
    ButtonModule,
    PanelModule,
    CardModule,
    TabViewModule,
    ToastModule,
    DropdownModule,
    DialogModule,
    AccordionModule,
    ConfirmDialogModule,
    MessagesModule,
    FileUploadModule,
    HttpClientModule
  ],
  exports: [
    ControleComponent
  ],providers:    [
    // ************************************
    { provide: LOCALE_ID, useValue: 'pt' },
    { provide: DEFAULT_CURRENCY_CODE, useValue: 'BRL' }
    // ************************************
  ], schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ControleModule { }
