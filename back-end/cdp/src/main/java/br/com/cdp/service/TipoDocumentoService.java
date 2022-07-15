package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.TipoDocumento;
import br.com.cdp.repository.TipoDocumentoRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class TipoDocumentoService {

  @Autowired
  TipoDocumentoRepository tipoDocumentoRepository;

  public TipoDocumento buscarPorId(Long idCliente) {

    return tipoDocumentoRepository.findById(idCliente).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<TipoDocumento> buscarTodos() {

    return tipoDocumentoRepository.findAllByOrderByNomeTipoDocumento();
  }

}
