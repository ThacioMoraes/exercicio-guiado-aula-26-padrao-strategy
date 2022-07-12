package br.com.digitalhouse.models;

public class Pfizer implements EstrategiaVacina {

  @Override
  public String dizOrigem() {
    return "EUA";
  }

  @Override
  public void vacinar() {
    System.out.println("Vacinando com Pfizer!");
  }

  @Override
  public boolean checaVacina(int doses) {
    if(doses == 2){
      return true;
    }
    return false;
  }


}
