package br.com.digitalhouse.models;

public interface EstrategiaVacina {
  public String dizOrigem();
  public void vacinar();
  public boolean checaVacina(int doses);
}
