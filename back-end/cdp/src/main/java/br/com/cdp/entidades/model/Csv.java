package br.com.cdp.entidades.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Csv implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String projeto;
  private String cliente;
  private String disciplina;
  private String numeroClienteFinal;
  private String numeroClienteOuEcr;
  private String tituloDoDocumento;
  private String revUe;
  private String status;
  private String tipoDocumento;
  private String responsavelEcr;
  private String peiEcr;
  private String peiCliente;
  private String reiCliente;
  private String dataEi;
  private String grdEi;
  private String cC;
  private String dataRecCc;
  private String pacEcr;
  private String pacCliente;
  private String racCliente;
  private String dataUe;
  private String grdUe;
  private String formato;
  private String qtdePagina;
  private String a1eq;
  private String peso;
  private String areaDoProjeto;
  private String tag;
  private String decisaoEnum;
  private String pendencia;
  private String valorVenda;
  private String bm1Cliente;
  private String valorBm1Cliente;
  private String bm2Cliente;
  private String valorBm2Cliente;
  private String bm3Cliente;
  private String valorBm3Cliente;
  private String bm4Cliente;
  private String valorBm4Cliente;
  private String valorContratado;
  private String bm1Ecr;
  private String valorBm1Ecr;
  private String bm2Ecr;
  private String valorBm2Ecr;
  private String bm3Ecr;
  private String valorBm3Ecr;
  private String bm4Ecr;
  private String valorBm4Ecr;

  public Csv() {
  }

  public Csv(String projeto, String cliente, String disciplina, String numeroClienteFinal,
      String numeroClienteOuEcr, String tituloDoDocumento, String revUe, String status, String tipoDocumento,
      String responsavelEcr, String peiEcr, String peiCliente, String reiCliente, String dataEi, String grdEi,
      String cC, String dataRecCc, String pacEcr, String pacCliente, String racCliente, String dataUe,
      String grdUe, String formato, String qtdePagina, String a1eq, String peso, String areaDoProjeto, String tag,
      String decisaoEnum, String pendencia, String valorVenda, String bm1Cliente, String valorBm1Cliente,
      String bm2Cliente, String valorBm2Cliente, String bm3Cliente, String valorBm3Cliente, String bm4Cliente,
      String valorBm4Cliente, String valorContratado, String bm1Ecr, String valorBm1Ecr, String bm2Ecr,
      String valorBm2Ecr, String bm3Ecr, String valorBm3Ecr, String bm4Ecr, String valorBm4Ecr) {
    super();
    this.projeto = projeto;
    this.cliente = cliente;
    this.disciplina = disciplina;
    this.numeroClienteFinal = numeroClienteFinal;
    this.numeroClienteOuEcr = numeroClienteOuEcr;
    this.tituloDoDocumento = tituloDoDocumento;
    this.revUe = revUe;
    this.status = status;
    this.tipoDocumento = tipoDocumento;
    this.responsavelEcr = responsavelEcr;
    this.peiEcr = peiEcr;
    this.peiCliente = peiCliente;
    this.reiCliente = reiCliente;
    this.dataEi = dataEi;
    this.grdEi = grdEi;
    this.cC = cC;
    this.dataRecCc = dataRecCc;
    this.pacEcr = pacEcr;
    this.pacCliente = pacCliente;
    this.racCliente = racCliente;
    this.dataUe = dataUe;
    this.grdUe = grdUe;
    this.formato = formato;
    this.qtdePagina = qtdePagina;
    this.a1eq = a1eq;
    this.peso = peso;
    this.areaDoProjeto = areaDoProjeto;
    this.tag = tag;
    this.decisaoEnum = decisaoEnum;
    this.pendencia = pendencia;
    this.valorVenda = valorVenda;
    this.bm1Cliente = bm1Cliente;
    this.valorBm1Cliente = valorBm1Cliente;
    this.bm2Cliente = bm2Cliente;
    this.valorBm2Cliente = valorBm2Cliente;
    this.bm3Cliente = bm3Cliente;
    this.valorBm3Cliente = valorBm3Cliente;
    this.bm4Cliente = bm4Cliente;
    this.valorBm4Cliente = valorBm4Cliente;
    this.valorContratado = valorContratado;
    this.bm1Ecr = bm1Ecr;
    this.valorBm1Ecr = valorBm1Ecr;
    this.bm2Ecr = bm2Ecr;
    this.valorBm2Ecr = valorBm2Ecr;
    this.bm3Ecr = bm3Ecr;
    this.valorBm3Ecr = valorBm3Ecr;
    this.bm4Ecr = bm4Ecr;
    this.valorBm4Ecr = valorBm4Ecr;
  }
}
