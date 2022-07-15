package br.com.cdp.entidades.model;

import java.io.Serializable;

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
  public String getProjeto() {
    return projeto;
  }
  public void setProjeto(String projeto) {
    this.projeto = projeto;
  }
  public String getCliente() {
    return cliente;
  }
  public void setCliente(String cliente) {
    this.cliente = cliente;
  }
  public String getDisciplina() {
    return disciplina;
  }
  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }
  public String getNumeroClienteFinal() {
    return numeroClienteFinal;
  }
  public void setNumeroClienteFinal(String numeroClienteFinal) {
    this.numeroClienteFinal = numeroClienteFinal;
  }
  public String getNumeroClienteOuEcr() {
    return numeroClienteOuEcr;
  }
  public void setNumeroClienteOuEcr(String numeroClienteOuEcr) {
    this.numeroClienteOuEcr = numeroClienteOuEcr;
  }
  public String getTituloDoDocumento() {
    return tituloDoDocumento;
  }
  public void setTituloDoDocumento(String tituloDoDocumento) {
    this.tituloDoDocumento = tituloDoDocumento;
  }
  public String getRevUe() {
    return revUe;
  }
  public void setRevUe(String revUe) {
    this.revUe = revUe;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public String getResponsavelEcr() {
    return responsavelEcr;
  }
  public void setResponsavelEcr(String responsavelEcr) {
    this.responsavelEcr = responsavelEcr;
  }
  public String getPeiEcr() {
    return peiEcr;
  }
  public void setPeiEcr(String peiEcr) {
    this.peiEcr = peiEcr;
  }
  public String getPeiCliente() {
    return peiCliente;
  }
  public void setPeiCliente(String peiCliente) {
    this.peiCliente = peiCliente;
  }
  public String getReiCliente() {
    return reiCliente;
  }
  public void setReiCliente(String reiCliente) {
    this.reiCliente = reiCliente;
  }
  public String getDataEi() {
    return dataEi;
  }
  public void setDataEi(String dataEi) {
    this.dataEi = dataEi;
  }
  public String getGrdEi() {
    return grdEi;
  }
  public void setGrdEi(String grdEi) {
    this.grdEi = grdEi;
  }
  public String getcC() {
    return cC;
  }
  public void setcC(String cC) {
    this.cC = cC;
  }
  public String getDataRecCc() {
    return dataRecCc;
  }
  public void setDataRecCc(String dataRecCc) {
    this.dataRecCc = dataRecCc;
  }
  public String getPacEcr() {
    return pacEcr;
  }
  public void setPacEcr(String pacEcr) {
    this.pacEcr = pacEcr;
  }
  public String getPacCliente() {
    return pacCliente;
  }
  public void setPacCliente(String pacCliente) {
    this.pacCliente = pacCliente;
  }
  public String getRacCliente() {
    return racCliente;
  }
  public void setRacCliente(String racCliente) {
    this.racCliente = racCliente;
  }
  public String getDataUe() {
    return dataUe;
  }
  public void setDataUe(String dataUe) {
    this.dataUe = dataUe;
  }
  public String getGrdUe() {
    return grdUe;
  }
  public void setGrdUe(String grdUe) {
    this.grdUe = grdUe;
  }
  public String getFormato() {
    return formato;
  }
  public void setFormato(String formato) {
    this.formato = formato;
  }
  public String getQtdePagina() {
    return qtdePagina;
  }
  public void setQtdePagina(String qtdePagina) {
    this.qtdePagina = qtdePagina;
  }
  public String getA1eq() {
    return a1eq;
  }
  public void setA1eq(String a1eq) {
    this.a1eq = a1eq;
  }
  public String getPeso() {
    return peso;
  }
  public void setPeso(String peso) {
    this.peso = peso;
  }
  public String getAreaDoProjeto() {
    return areaDoProjeto;
  }
  public void setAreaDoProjeto(String areaDoProjeto) {
    this.areaDoProjeto = areaDoProjeto;
  }
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }
  public String getDecisaoEnum() {
    return decisaoEnum;
  }
  public void setDecisaoEnum(String decisaoEnum) {
    this.decisaoEnum = decisaoEnum;
  }
  public String getPendencia() {
    return pendencia;
  }
  public void setPendencia(String pendencia) {
    this.pendencia = pendencia;
  }
  public String getValorVenda() {
    return valorVenda;
  }
  public void setValorVenda(String valorVenda) {
    this.valorVenda = valorVenda;
  }
  public String getBm1Cliente() {
    return bm1Cliente;
  }
  public void setBm1Cliente(String bm1Cliente) {
    this.bm1Cliente = bm1Cliente;
  }
  public String getValorBm1Cliente() {
    return valorBm1Cliente;
  }
  public void setValorBm1Cliente(String valorBm1Cliente) {
    this.valorBm1Cliente = valorBm1Cliente;
  }
  public String getBm2Cliente() {
    return bm2Cliente;
  }
  public void setBm2Cliente(String bm2Cliente) {
    this.bm2Cliente = bm2Cliente;
  }
  public String getValorBm2Cliente() {
    return valorBm2Cliente;
  }
  public void setValorBm2Cliente(String valorBm2Cliente) {
    this.valorBm2Cliente = valorBm2Cliente;
  }
  public String getBm3Cliente() {
    return bm3Cliente;
  }
  public void setBm3Cliente(String bm3Cliente) {
    this.bm3Cliente = bm3Cliente;
  }
  public String getValorBm3Cliente() {
    return valorBm3Cliente;
  }
  public void setValorBm3Cliente(String valorBm3Cliente) {
    this.valorBm3Cliente = valorBm3Cliente;
  }
  public String getBm4Cliente() {
    return bm4Cliente;
  }
  public void setBm4Cliente(String bm4Cliente) {
    this.bm4Cliente = bm4Cliente;
  }
  public String getValorBm4Cliente() {
    return valorBm4Cliente;
  }
  public void setValorBm4Cliente(String valorBm4Cliente) {
    this.valorBm4Cliente = valorBm4Cliente;
  }
  public String getValorContratado() {
    return valorContratado;
  }
  public void setValorContratado(String valorContratado) {
    this.valorContratado = valorContratado;
  }
  public String getBm1Ecr() {
    return bm1Ecr;
  }
  public void setBm1Ecr(String bm1Ecr) {
    this.bm1Ecr = bm1Ecr;
  }
  public String getValorBm1Ecr() {
    return valorBm1Ecr;
  }
  public void setValorBm1Ecr(String valorBm1Ecr) {
    this.valorBm1Ecr = valorBm1Ecr;
  }
  public String getBm2Ecr() {
    return bm2Ecr;
  }
  public void setBm2Ecr(String bm2Ecr) {
    this.bm2Ecr = bm2Ecr;
  }
  public String getValorBm2Ecr() {
    return valorBm2Ecr;
  }
  public void setValorBm2Ecr(String valorBm2Ecr) {
    this.valorBm2Ecr = valorBm2Ecr;
  }
  public String getBm3Ecr() {
    return bm3Ecr;
  }
  public void setBm3Ecr(String bm3Ecr) {
    this.bm3Ecr = bm3Ecr;
  }
  public String getValorBm3Ecr() {
    return valorBm3Ecr;
  }
  public void setValorBm3Ecr(String valorBm3Ecr) {
    this.valorBm3Ecr = valorBm3Ecr;
  }
  public String getBm4Ecr() {
    return bm4Ecr;
  }
  public void setBm4Ecr(String bm4Ecr) {
    this.bm4Ecr = bm4Ecr;
  }
  public String getValorBm4Ecr() {
    return valorBm4Ecr;
  }
  public void setValorBm4Ecr(String valorBm4Ecr) {
    this.valorBm4Ecr = valorBm4Ecr;
  }
  
}
