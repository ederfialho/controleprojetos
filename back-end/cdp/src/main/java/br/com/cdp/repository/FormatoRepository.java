package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.Formato;

public interface FormatoRepository extends JpaRepository<Formato, Long> {

  List<Formato> findAllByOrderByNomeFormato();

}
