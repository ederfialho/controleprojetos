package br.com.cdp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cdp.entidades.model.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {

  List<TipoDocumento> findAllByOrderByNomeTipoDocumento();

}
