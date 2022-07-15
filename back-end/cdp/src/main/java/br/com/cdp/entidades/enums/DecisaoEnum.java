package br.com.cdp.entidades.enums;

import br.com.cdp.commons.utils.Utils;

public enum DecisaoEnum {

  SIM("SIM"), NAO("NÃO"), NÃO("NÃO");

  private String decisao;

  DecisaoEnum(String decisao) {
    this.decisao = decisao;
  }

  public String getDecisao() {
    return decisao;
  }

  public static DecisaoEnum getEnumFromString(String enumName) {
    return Utils.getEnumFromString(DecisaoEnum.class, enumName);
  }

}
