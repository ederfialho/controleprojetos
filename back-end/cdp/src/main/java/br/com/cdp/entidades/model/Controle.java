package br.com.cdp.entidades.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import br.com.cdp.entidades.enums.DecisaoEnum;

@Entity
@Table(name = "tb_controle")
public class Controle implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_controle")
  private Long id;
  
  @OneToOne
  @JoinColumn(name = "id_projeto")
  private Projeto projeto;
  
  @OneToOne
  @JoinColumn(name = "id_cliente")
  private Cliente cliente;
  
  @OneToOne
  @JoinColumn(name = "id_disciplina")
  private Disciplina disciplina;
  
  @Column(name = "numero_cliente_final", length = 20)
  private String numeroClienteFinal;
  
  @Column(name = "numero_cliente_ou_ecr", length = 30)
  private String numeroClienteOuEcr;
  
  @Column(name = "titulo_do_documento")
  private String tituloDoDocumento;
  
  @Column(name = "rev_ue", length = 10)
  private String revUe;
  
  @OneToOne
  @JoinColumn(name = "id_status")
  private Status status;
  
  @OneToOne
  @JoinColumn(name = "id_tipo_documento")
  private TipoDocumento tipoDocumento;
  
  @OneToOne
  @JoinColumn(name = "id_responsavel_ecr")
  private ResponsavelEcr responsavelEcr;
  
  @Column(name = "pei_ecr", length = 20)
  private String peiEcr;
  
  @Column(name = "pei_cliente", length = 20)
  private String peiCliente;
  
  @Column(name = "rei_cliente", length = 20)
  private String reiCliente;

  @Temporal(TemporalType.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "America/Sao_Paulo")
  @Column(name = "data_ei")
  private Date dataEi;
  
  @Column(name = "grd_ei", length = 150)
  private String grdEi;
  
  @Column(name = "cc", length = 6)
  private String cC;
  
  @Temporal(TemporalType.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "America/Sao_Paulo")
  @Column(name = "data_rec_cc")
  private Date dataRecCc;
  
  @Temporal(TemporalType.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "America/Sao_Paulo")
  @Column(name = "pac_ecr")
  private Date pacEcr;
  
  @Temporal(TemporalType.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "America/Sao_Paulo")
  @Column(name = "pac_cliente")
  private Date pacCliente;
  
  @Column(name = "rac_cliente", length = 30)
  private String racCliente;
  
  @Temporal(TemporalType.DATE)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "America/Sao_Paulo")
  @Column(name = "data_ue")
  private Date dataUe;
  
  @Column(name = "grd_ue", length = 30)
  private String grdUe;
  
  @OneToOne
  @JoinColumn(name = "id_formato")
  private Formato formato;
  
  @Column(name = "qtde_pagina", length = 10)
  private int qtdePagina;
  
  @Column(name = "a1eq", length = 10)
  private int a1eq;
  
  @Column(name = "peso")
  private Double peso;
  
  @Column(name = "area_do_projeto", length = 70)
  private String areaDoProjeto;
  
  @Column(name = "tag", length = 20)
  private String tag;
  
  @Column(name = "status_pendencia")
  @Enumerated(EnumType.STRING)
  private DecisaoEnum decisaoEnum;
  
  @Column(name = "pendencia")
  private String pendencia;
  
  @Column(name = "valor_venda")
  private Double valorVenda;
  
  @Column(name = "bm1_cliente", length = 50)
  private String bm1Cliente;
  
  @Column(name = "valor_bm1_cliente")
  private Double valorBm1Cliente;
  
  @Column(name = "bm2_cliente", length = 50)
  private String bm2Cliente;
  
  @Column(name = "valor_bm2_cliente")
  private Double valorBm2Cliente;
  
  @Column(name = "bm3_cliente", length = 50)
  private String bm3Cliente;
  
  @Column(name = "valor_bm3_cliente")
  private Double valorBm3Cliente;
  
  @Column(name = "bm4_cliente", length = 50)
  private String bm4Cliente;
  
  @Column(name = "valor_bm4_cliente")
  private Double valorBm4Cliente;
  
  @Column(name = "valor_contratado")
  private Double valorContratado;
  
  @Column(name = "bm1_ecr", length = 50)
  private String bm1Ecr;
  
  @Column(name = "valor_bm1_ecr")
  private Double valorBm1Ecr;
  
  @Column(name = "bm2_ecr", length = 50)
  private String bm2Ecr;
  
  @Column(name = "valor_bm2_ecr")
  private Double valorBm2Ecr;
  
  @Column(name = "bm3_ecr", length = 50)
  private String bm3Ecr;
  
  @Column(name = "valor_bm3_ecr")
  private Double valorBm3Ecr;
  
  @Column(name = "bm4_ecr", length = 50)
  private String bm4Ecr;
  
  @Column(name = "valor_bm4_ecr")
  private Double valorBm4Ecr;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Projeto getProjeto() {
    return projeto;
  }

  public void setProjeto(Projeto projeto) {
    this.projeto = projeto;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Disciplina getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(Disciplina disciplina) {
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

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public TipoDocumento getTipoDocumento() {
    return tipoDocumento;
  }

  public void setTipoDocumento(TipoDocumento tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  public ResponsavelEcr getResponsavelEcr() {
    return responsavelEcr;
  }

  public void setResponsavelEcr(ResponsavelEcr responsavelEcr) {
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

  public Date getDataEi() {
    return dataEi;
  }

  public void setDataEi(Date dataEi) {
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

  public void setCc(String cC) {
    this.cC = cC;
  }

  public Date getDataRecCc() {
    return dataRecCc;
  }

  public void setDataRecCc(Date dataRecCc) {
    this.dataRecCc = dataRecCc;
  }

  public Date getPacEcr() {
    return pacEcr;
  }

  public void setPacEcr(Date pacEcr) {
    this.pacEcr = pacEcr;
  }

  public Date getPacCliente() {
    return pacCliente;
  }

  public void setPacCliente(Date pacCliente) {
    this.pacCliente = pacCliente;
  }

  public String getRacCliente() {
    return racCliente;
  }

  public void setRacCliente(String racCliente) {
    this.racCliente = racCliente;
  }

  public Date getDataUe() {
    return dataUe;
  }

  public void setDataUe(Date dataUe) {
    this.dataUe = dataUe;
  }

  public String getGrd_ue() {
    return grdUe;
  }

  public void setGrd_ue(String grdUe) {
    this.grdUe = grdUe;
  }

  public Formato getFormato() {
    return formato;
  }

  public void setFormato(Formato formato) {
    this.formato = formato;
  }

  public int getQtdePagina() {
    return qtdePagina;
  }

  public void setQtdePagina(int qtdePagina) {
    this.qtdePagina = qtdePagina;
  }

  public int getA1eq() {
    return a1eq;
  }

  public void setA1eq(int a1eq) {
    this.a1eq = a1eq;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPeso(Double peso) {
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

  public DecisaoEnum getDecisaoEnum() {
    return decisaoEnum;
  }

  public void setDecisaoEnum(DecisaoEnum decisaoEnum) {
    this.decisaoEnum = decisaoEnum;
  }

  public String getPendencia() {
    return pendencia;
  }

  public void setPendencia(String pendencia) {
    this.pendencia = pendencia;
  }

  public Double getValorVenda() {
    return valorVenda;
  }

  public void setValorVenda(Double valorVenda) {
    this.valorVenda = valorVenda;
  }

  public String getBm1Cliente() {
    return bm1Cliente;
  }

  public void setBm1Cliente(String bm1Cliente) {
    this.bm1Cliente = bm1Cliente;
  }

  public Double getValorBm1Cliente() {
    return valorBm1Cliente;
  }

  public void setValorBm1Cliente(Double valorBm1Cliente) {
    this.valorBm1Cliente = valorBm1Cliente;
  }

  public String getBm2Cliente() {
    return bm2Cliente;
  }

  public void setBm2Cliente(String bm2Cliente) {
    this.bm2Cliente = bm2Cliente;
  }

  public Double getValorBm2Cliente() {
    return valorBm2Cliente;
  }

  public void setValorBm2Cliente(Double valorBm2Cliente) {
    this.valorBm2Cliente = valorBm2Cliente;
  }

  public String getBm3Cliente() {
    return bm3Cliente;
  }

  public void setBm3Cliente(String bm3Cliente) {
    this.bm3Cliente = bm3Cliente;
  }

  public Double getValorBm3Cliente() {
    return valorBm3Cliente;
  }

  public void setValorBm3Cliente(Double valorBm3Cliente) {
    this.valorBm3Cliente = valorBm3Cliente;
  }

  public String getBm4Cliente() {
    return bm4Cliente;
  }

  public void setBm4Cliente(String bm4Cliente) {
    this.bm4Cliente = bm4Cliente;
  }

  public Double getValorBm4Cliente() {
    return valorBm4Cliente;
  }

  public void setValorBm4Cliente(Double valorBm4Cliente) {
    this.valorBm4Cliente = valorBm4Cliente;
  }

  public Double getValorContratado() {
    return valorContratado;
  }

  public void setValorContratado(Double valorContratado) {
    this.valorContratado = valorContratado;
  }

  public String getBm1Ecr() {
    return bm1Ecr;
  }

  public void setBm1Ecr(String bm1Ecr) {
    this.bm1Ecr = bm1Ecr;
  }

  public Double getValorBm1Ecr() {
    return valorBm1Ecr;
  }

  public void setValorBm1Ecr(Double valorBm1Ecr) {
    this.valorBm1Ecr = valorBm1Ecr;
  }

  public String getBm2Ecr() {
    return bm2Ecr;
  }

  public void setBm2Ecr(String bm2Ecr) {
    this.bm2Ecr = bm2Ecr;
  }

  public Double getValorBm2Ecr() {
    return valorBm2Ecr;
  }

  public void setValorBm2Ecr(Double valorBm2Ecr) {
    this.valorBm2Ecr = valorBm2Ecr;
  }

  public String getBm3Ecr() {
    return bm3Ecr;
  }

  public void setBm3Ecr(String bm3Ecr) {
    this.bm3Ecr = bm3Ecr;
  }

  public Double getValorBm3Ecr() {
    return valorBm3Ecr;
  }

  public void setValorBm3Ecr(Double valorBm3Ecr) {
    this.valorBm3Ecr = valorBm3Ecr;
  }

  public String getBm4Ecr() {
    return bm4Ecr;
  }

  public void setBm4Ecr(String bm4Ecr) {
    this.bm4Ecr = bm4Ecr;
  }

  public Double getValorBm4Ecr() {
    return valorBm4Ecr;
  }

  public void setValorBm4Ecr(Double valorBm4Ecr) {
    this.valorBm4Ecr = valorBm4Ecr;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Controle other = (Controle) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
  
}
