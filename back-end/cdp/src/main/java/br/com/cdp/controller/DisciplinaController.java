package br.com.cdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cdp.service.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

  @Autowired
  DisciplinaService disciplinaService;

  @GetMapping("/{idDisciplina}")
  public ResponseEntity<Object> buscarPorId(@PathVariable Long idDisciplina) {
    try {
      return new ResponseEntity<>(disciplinaService.buscarPorId(idDisciplina), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping
  public ResponseEntity<Object> buscarTodos() {
    try {
      return new ResponseEntity<>(disciplinaService.buscarTodos(), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

}
