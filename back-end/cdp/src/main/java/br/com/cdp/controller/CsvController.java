package br.com.cdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import br.com.cdp.service.CsvService;

@RestController
@RequestMapping("/csv")
public class CsvController {

  @Autowired
  CsvService csvService;
  
  @PutMapping("/{upload}")
  public ResponseEntity<Object> buscarPorId(@RequestParam("file") MultipartFile file) {
    try {
      //return new ResponseEntity<>(clienteService.buscarPorId(idCliente), HttpStatus.OK);
      return new ResponseEntity<>(HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

}
