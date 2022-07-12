package br.com.digitalhouse.models;

public class Paciente {

  private String nome;
  private int vacinasRecebidas;
  private EstrategiaVacina vacina;

  public Paciente(String nome, EstrategiaVacina vacina) {
    this.nome = nome;
    this.vacinasRecebidas = 0;
    this.vacina = vacina;
  }

  public String getNome() {
    return nome;
  }

  public void vacinar(){
    this.vacina.vacinar();
    this.vacinasRecebidas += 1;
  }

  public void setVacina(EstrategiaVacina vacina){
    this.vacina = vacina;
  }

  public String dizOrigem(){
    return this.vacina.dizOrigem();
  }

  public boolean checaVacina(){
    return this.vacina.checaVacina(this.vacinasRecebidas);
  }

}
