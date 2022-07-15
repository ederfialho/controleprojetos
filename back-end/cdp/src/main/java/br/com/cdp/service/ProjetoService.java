package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Projeto;
import br.com.cdp.repository.ProjetoRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class ProjetoService {

  @Autowired
  ProjetoRepository projetoRepository;
  
  public Projeto buscarPorId(Long idProjeto) {

    return projetoRepository.findById(idProjeto).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Projeto> buscarTodos() {

    return projetoRepository.findAllByOrderByNomeProjeto();
  }
}
