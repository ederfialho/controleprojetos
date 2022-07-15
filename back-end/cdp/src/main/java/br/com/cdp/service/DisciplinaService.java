package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Disciplina;
import br.com.cdp.repository.DisciplinaRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class DisciplinaService {
  
  @Autowired
  DisciplinaRepository disciplinaRepository;
  
  public Disciplina buscarPorId(Long idDisciplina) {

    return disciplinaRepository.findById(idDisciplina).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Disciplina> buscarTodos() {

    return disciplinaRepository.findAllByOrderByNomeDisciplina();
  }

}
