package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

  List<Disciplina> findAllByOrderByNomeDisciplina();

}
