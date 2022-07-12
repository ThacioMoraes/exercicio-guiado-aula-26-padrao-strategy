package br.com.digitalhouse.models;

public class AztraZeneca implements EstrategiaVacina{

  @Override
  public String dizOrigem() {
    return "Inglaterra";
  }

  @Override
  public void vacinar() {
    System.out.println("Vacinando com AztraZeneca");
  }

  @Override
  public boolean checaVacina(int doses) {
    if(doses == 1){
      return true;
    }
    return false;
  }
}
