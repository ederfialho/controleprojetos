package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.ResponsavelEcr;
import br.com.cdp.repository.ResponsavelEcrRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class ResponsavelEcrService {
  
  @Autowired
  ResponsavelEcrRepository responsavelEcrRepository;
  
  public ResponsavelEcr buscarPorId(Long idResponsavelEcr) {

    return responsavelEcrRepository.findById(idResponsavelEcr).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<ResponsavelEcr> buscarTodos() {

    return responsavelEcrRepository.findAllByOrderByNomeResponsavelEcr();
  }

}
