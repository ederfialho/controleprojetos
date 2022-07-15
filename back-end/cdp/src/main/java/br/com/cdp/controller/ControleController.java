package br.com.cdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cdp.service.ControleService;

@RestController
@RequestMapping("/controle")
public class ControleController {

  @Autowired
  ControleService controleService;

  @GetMapping("/{idControle}")
  public ResponseEntity<Object> buscarPorId(@PathVariable Long idControle) {
    try {
      return new ResponseEntity<>(controleService.buscarPorId(idControle), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping
  public ResponseEntity<Object> buscarTodos() {
    try {
      return new ResponseEntity<>(controleService.buscarTodos(), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping("/buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal")
  public ResponseEntity<Object> buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal() {
    try {
      return new ResponseEntity<>(controleService.buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal(),
          HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }
  
  @GetMapping("/buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr")
  public ResponseEntity<Object> buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr() {
    try {
      return new ResponseEntity<>(controleService.buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr(),
          HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

}
