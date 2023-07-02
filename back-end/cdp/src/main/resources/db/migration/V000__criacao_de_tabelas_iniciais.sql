CREATE TABLE tb_cliente (
  id_cliente int(4) NOT NULL AUTO_INCREMENT,
  nome_cliente varchar(100) NOT NULL,
  PRIMARY KEY (id_cliente),
  UNIQUE KEY id_cliente (id_cliente)
) ENGINE=MyISAM;

CREATE TABLE tb_disciplina (
  id_disciplina INTEGER(3) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_disciplina VARCHAR(40) NOT NULL,
  PRIMARY KEY (id_disciplina)
) ENGINE=MyISAM;

INSERT INTO tb_disciplina (nome_disciplina) VALUES ('COORDENACAO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('PLANEJAMENTO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('ARQUIVO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('PROCESSO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('SISTEMAS');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('TUBULACAO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('MECANICA');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('INFRAESTRUTURA');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('ARQUITETURA');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('ESTRUTURA METALICA');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('CIVIL');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('ELETRICA');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('INSTRUMENTACAO-AUTOMACAO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('TELECOMUNICACAO');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('SPCI');
INSERT INTO tb_disciplina (nome_disciplina) VALUES ('ENGENHARIA DE CUSTO');

CREATE TABLE tb_formato (
  id_formato INTEGER(2) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_formato VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_formato)
) ENGINE=MyISAM;

INSERT INTO tb_formato (nome_formato) VALUES ('A0');
INSERT INTO tb_formato (nome_formato) VALUES ('10A4');
INSERT INTO tb_formato (nome_formato) VALUES ('A1');
INSERT INTO tb_formato (nome_formato) VALUES ('A2');
INSERT INTO tb_formato (nome_formato) VALUES ('A3');
INSERT INTO tb_formato (nome_formato) VALUES ('A4');

CREATE TABLE tb_projeto (
  id_projeto INTEGER(4) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_projeto VARCHAR(60) NOT NULL,
  PRIMARY KEY (id_projeto)
) ENGINE=MyISAM;

CREATE TABLE tb_responsavel_ecr (
  id_responsavel_ecr INTEGER(3) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_responsavel_ecr VARCHAR(60) NOT NULL,
  PRIMARY KEY (id_responsavel_ecr)
) ENGINE=MyISAM;


CREATE TABLE tb_status (
  id_status INTEGER(2) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_status VARCHAR(30) NOT NULL,
  PRIMARY KEY (id_status)
) ENGINE=MyISAM;

INSERT INTO tb_status (nome_status) VALUE ('A PLANEJAR');
INSERT INTO tb_status (nome_status) VALUE ('A CONTRATAR');
INSERT INTO tb_status (nome_status) VALUE ('ADICIONAR NA LD');
INSERT INTO tb_status (nome_status) VALUE ('APROVADO');
INSERT INTO tb_status (nome_status) VALUE ('CANCELADO');
INSERT INTO tb_status (nome_status) VALUE ('EM ATENDIMENTO DE COMENTÁRIO');
INSERT INTO tb_status (nome_status) VALUE ('EM ELABORAÇÃO');
INSERT INTO tb_status (nome_status) VALUE ('EMITIDO');
INSERT INTO tb_status (nome_status) VALUE ('EMITIDO AC');
INSERT INTO tb_status (nome_status) VALUE ('EXCLUÍDO');
INSERT INTO tb_status (nome_status) VALUE ('PLANEJADO');
INSERT INTO tb_status (nome_status) VALUE ('VAGO');

CREATE TABLE tb_tipo_documento (
  id_tipo_documento INTEGER(3) NOT NULL AUTO_INCREMENT UNIQUE,
  nome_tipo_documento VARCHAR(40) NOT NULL,
  PRIMARY KEY (id_tipo_documento)
) ENGINE=MyISAM;

INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ARRANJO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ARRANJO BASICO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ARRANJO GERAL');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('AS BUILT');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('CAPEX');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('CONJUNTO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('CRITERIO DE PROJETO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DESENHO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DESENHO DE ARMACAO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DESENHO DE FORMA');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DESENHO DE LOCACAO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DETALHE DE FABRICACAO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DETALHES TIPICOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA DE CONFIGURACAO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA DE INTERLIGACAO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA DE MONTAGEM');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA FUNCIONAL');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA TRIFILAR');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('DIAGRAMA UNIFILAR');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ESPECIFICACAO DE SERVICO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ESPECIFICACAO TECNICA');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('ESTUDO DE DEMANDA');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('FLUXOGRAMA DE PROCESSO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('FLUXOGRMA DE ENGENHARIA');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('FOLHA DE DADOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE CABOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE CHUMBADORES');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE EQUIPAMENTOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE EQUIPAMENTOS ELETRICOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE EQUIPAMENTOS TELECOMUNICACOES');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE INSTRUMENTOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE MATERIAIS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE PARAFUSOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('LISTA DE SUPORTES');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('MAPA DE SUPRIMENTOS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('MEMORIA DE CALCULO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('MEMORIAL DESCRITIVO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('MODELO 3D');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('PLANILHA DE QUANTIDADE');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('PLANO DE BASE COM CARGAS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('PLANO DE CARGAS');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('PLANO DE SONDAGEM');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('PLANO DIRETOR');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('RELACAO E/S');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('RELATORIO');
INSERT INTO tb_tipo_documento (nome_tipo_documento) VALUES ('REQUISICAO TECNICA');

CREATE TABLE tb_controle (
  id_controle INTEGER(6) NOT NULL AUTO_INCREMENT UNIQUE,
  id_projeto INTEGER(4) NOT NULL,
  id_cliente INTEGER(4) NOT NULL,
  id_disciplina INTEGER(4) NOT NULL,
  numero_cliente_final VARCHAR(20) DEFAULT NULL,
  numero_cliente_ou_ecr VARCHAR(30) DEFAULT NULL,
  titulo_do_documento TEXT,
  rev_ue INTEGER(3) DEFAULT NULL,
  id_status INTEGER(2) NOT NULL,
  id_tipo_documento INTEGER(3) NOT NULL,
  id_responsavel_ecr INTEGER(4) NOT NULL,
  pei_ecr VARCHAR(60) DEFAULT NULL,
  pei_cliente VARCHAR(20) DEFAULT NULL,
  rei_cliente VARCHAR(20) DEFAULT NULL,
  data_ei DATETIME DEFAULT NULL,
  grd_ei VARCHAR(150) DEFAULT NULL,
  cc VARCHAR(6) DEFAULT NULL,
  data_rec_cc DATETIME DEFAULT NULL,
  pac_ecr VARCHAR(30) DEFAULT NULL,
  pac_cliente VARCHAR(30) DEFAULT NULL,
  rac_cliente VARCHAR(30) DEFAULT NULL,
  data_ue DATETIME DEFAULT NULL,
  grd_ue VARCHAR(100) DEFAULT NULL,
  id_formato INTEGER(2) DEFAULT NULL,
  qtde_pagina INTEGER(4) DEFAULT NULL,
  a1eq INTEGER(4) DEFAULT NULL,
  peso DOUBLE(9,5) DEFAULT NULL,
  area_do_projeto VARCHAR(70) DEFAULT NULL,
  tag VARCHAR(20) DEFAULT NULL,
  status_pendencia VARCHAR(6) DEFAULT NULL,
  pendencia TEXT,
  valor_venda DOUBLE(9,2) DEFAULT NULL,
  bm1_cliente VARCHAR(100) DEFAULT NULL,
  valor_bm1_cliente DOUBLE(9,2) DEFAULT NULL,
  bm2_cliente VARCHAR(100) DEFAULT NULL,
  valor_bm2_cliente DOUBLE(9,2) DEFAULT NULL,
  bm3_cliente VARCHAR(100) DEFAULT NULL,
  valor_bm3_cliente DOUBLE(9,2) DEFAULT NULL,
  bm4_cliente VARCHAR(100) DEFAULT NULL,
  valor_bm4_cliente DOUBLE(9,2) DEFAULT NULL,
  valor_contratado DOUBLE(9,2) DEFAULT NULL,
  bm1_ecr VARCHAR(100) DEFAULT NULL,
  valor_bm1_ecr DOUBLE(9,2) DEFAULT NULL,
  bm2_ecr VARCHAR(100) DEFAULT NULL,
  valor_bm2_ecr DOUBLE(9,2) DEFAULT NULL,
  bm3_ecr VARCHAR(100) DEFAULT NULL,
  valor_bm3_ecr DOUBLE(9,2) DEFAULT NULL,
  bm4_ecr VARCHAR(100) DEFAULT NULL,
  valor_bm4_ecr DOUBLE(9,2) DEFAULT NULL,
  PRIMARY KEY (id_controle)
) ENGINE=MyISAM;
