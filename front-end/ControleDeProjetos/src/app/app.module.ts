import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//Imports PrimeNG
import { CardModule } from 'primeng/card';

//Imports Components e Services do Projeto
import { ControleModule } from './controle/controle.module';
import { ControleProjetosService } from 'src/services/controle-projetos.service';
import { FileUploadModule } from 'ng2-file-upload';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CardModule,
    ControleModule,
    FileUploadModule
  ],
  providers: [ControleProjetosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
