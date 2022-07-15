package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.ResponsavelEcr;

public interface ResponsavelEcrRepository extends JpaRepository<ResponsavelEcr, Long> {

  List<ResponsavelEcr> findAllByOrderByNomeResponsavelEcr();

}
