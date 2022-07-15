package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{

  List<Status> findAllByOrderByNomeStatus();

}
