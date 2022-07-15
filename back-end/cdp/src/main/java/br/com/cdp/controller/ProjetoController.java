package br.com.cdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cdp.service.ProjetoService;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {
  
  @Autowired
  ProjetoService projetoService;
  
  @GetMapping("/{idProjeto}")
  public ResponseEntity<Object> buscarPorId(@PathVariable Long idProjeto) {
    try {
      return new ResponseEntity<>(projetoService.buscarPorId(idProjeto), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping
  public ResponseEntity<Object> buscarTodos() {
    try {
      return new ResponseEntity<>(projetoService.buscarTodos(), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

}
