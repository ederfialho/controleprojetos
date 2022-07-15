package br.com.cdp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.cdp.commons.exception.GlobalException;
import br.com.cdp.entidades.model.Cliente;
import br.com.cdp.repository.ClienteRepository;

@Transactional(propagation = Propagation.REQUIRED)
@SuppressWarnings("all")
@Service
public class ClienteService {

  @Autowired
  ClienteRepository clienteRepository;

  public Cliente buscarPorId(Long idCliente) {

    return clienteRepository.findById(idCliente).orElseThrow(() -> new GlobalException(
        "Problema na hora de buscar!"));
  }

  public List<Cliente> buscarTodos() {

    return clienteRepository.findAllByOrderByNomeCliente();
  }

}
