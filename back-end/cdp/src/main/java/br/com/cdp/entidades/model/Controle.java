package br.com.cdp.entidades.model;

import java.io.Serial;
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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_controle")
public class Controle implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  
  @Id
  @EqualsAndHashCode.Include
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
}
