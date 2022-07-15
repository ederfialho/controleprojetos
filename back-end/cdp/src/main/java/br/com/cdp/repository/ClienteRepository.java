package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

  List<Cliente> findAllByOrderByNomeCliente();

}
