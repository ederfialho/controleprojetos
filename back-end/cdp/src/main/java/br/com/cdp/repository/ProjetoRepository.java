package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

  List<Projeto> findAllByOrderByNomeProjeto();

}
