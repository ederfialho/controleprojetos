import { Component, OnInit } from '@angular/core';
import { FileUploader } from 'ng2-file-upload';

const URL = 'https://evening-anchorage-3159.herokuapp.com/api/';

@Component({
  selector: 'app-importar-arquivos',
  templateUrl: './importar-arquivos.component.html',
  styleUrls: ['./importar-arquivos.component.css']
})
export class ImportarArquivosComponent implements OnInit {

  uploader = {} as FileUploader;
  hasBaseDropZoneOver = {} as boolean;
  hasAnotherDropZoneOver = {} as boolean;
  response = {} as string;

  constructor() {

  }

  ngOnInit(): void {

    this.iniciarUploader();
  }

  private iniciarUploader() {

    this.uploader = new FileUploader({
      url: URL,
      disableMultipart: true, // 'DisableMultipart' must be 'true' for formatDataFunction to be called.
      formatDataFunctionIsAsync: true,
      formatDataFunction: async (item: { _file: { name: any; size: any; type: any; }; }) => {
        return new Promise( (resolve, reject) => {
          resolve({
            name: item._file.name,
            length: item._file.size,
            contentType: item._file.type,
            date: new Date()
          });
        });
      }
    });

    this.hasBaseDropZoneOver = false;
    this.hasAnotherDropZoneOver = false;

    this.response = '';

    this.uploader.response.subscribe( res => this.response = res );

  }

}
