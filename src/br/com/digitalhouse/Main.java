package br.com.digitalhouse;

import br.com.digitalhouse.models.AztraZeneca;
import br.com.digitalhouse.models.EstrategiaVacina;
import br.com.digitalhouse.models.Paciente;
import br.com.digitalhouse.models.Pfizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstrategiaVacina pfizer = new Pfizer();
        EstrategiaVacina az = new AztraZeneca();

        Paciente p1;
        String nome;
        int vacina;

        System.out.println("Qual o nome do paciente?");

        nome = scanner.nextLine();

        System.out.println("Vacina desejada? digite 1 para Pfizer ou 2 para AztraZeneca");

        vacina = scanner.nextInt();

        if(vacina == 1){
            p1 = new Paciente(nome, pfizer);
        } else {
            p1 = new Paciente(nome, az);
        }

        System.out.println("A vacina de " + p1.getNome() + " tem origem: " + p1.dizOrigem());
        p1.vacinar();
        System.out.println( p1.getNome() + " tomou as doses necessárias? " + p1.checaVacina());
    }
}
