package br.com.cdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cdp.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

  @Autowired
  ClienteService clienteService;

  @GetMapping("/{idCliente}")
  public ResponseEntity<Object> buscarPorId(@PathVariable Long idCliente) {
    try {
      return new ResponseEntity<>(clienteService.buscarPorId(idCliente), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping
  public ResponseEntity<Object> buscarTodos() {
    try {
      return new ResponseEntity<>(clienteService.buscarTodos(), HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
  }

}
