package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.cdp.entidades.model.Controle;

public interface ControleRepository extends JpaRepository<Controle, Long> {

  @Query(
      value = "SELECT controle.* FROM tb_controle AS controle ORDER BY id_projeto, id_cliente, numero_cliente_final",
      nativeQuery = true)
  List<Controle> buscarTodosOrdenadoPorProjetoClienteNumeroClienteFinal();
  
  @Query(
      value = "SELECT controle.* FROM tb_controle AS controle ORDER BY id_projeto, id_cliente, numero_cliente_ou_ecr",
      nativeQuery = true)
  List<Controle> buscarTodosOrdenadoPorProjetoClienteNumeroClienteOuEcr();

}
