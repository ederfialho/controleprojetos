package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Formato;
import br.com.cdp.repository.FormatoRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class FormatoService {
  
  @Autowired
  FormatoRepository formatoRepository;
  
  public Formato buscarPorId(Long idFormato) {

    return formatoRepository.findById(idFormato).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Formato> buscarTodos() {

    return formatoRepository.findAllByOrderByNomeFormato();
  }

}
