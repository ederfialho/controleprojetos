package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Controle;
import br.com.cdp.repository.ControleRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class ControleService {

  @Autowired
  ControleRepository controleRepository;
  
  public Controle buscarPorId(Long idControle) {

    return controleRepository.findById(idControle).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Controle> buscarTodos() {

    return controleRepository.findAll();
  }
  
  public List<Controle> buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal() {
    return controleRepository.buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal();
  }
  
  public List<Controle> buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr() {
    return controleRepository.buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr();
  }
  
}
