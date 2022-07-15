package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Status;
import br.com.cdp.repository.StatusRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class StatusService {
  
  @Autowired
  StatusRepository statusRepository;
  
  public Status buscarPorId(Long idStatus) {

    return statusRepository.findById(idStatus).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Status> buscarTodos() {

    return statusRepository.findAllByOrderByNomeStatus();
  }

}
