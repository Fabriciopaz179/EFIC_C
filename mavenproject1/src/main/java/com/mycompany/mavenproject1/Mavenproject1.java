package com.mycompany.mavenproject1;

import modelo.Cliente;
import java.util.Scanner;

public class Mavenproject1 {

    static Scanner javain = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

        int opcao;
        do {
            System.out.println("Digite a opção: ");
            opcao = javain.nextInt();

            switch(opcao) {
                case 0:
                    System.out.println("---- PROGRAMA ENCERRADO ----");
                    break;
                case 1:
                    javain.nextLine();
                    Cliente c = new Cliente();
                    System.out.println("--- Cadastrar Cliente ---");
                    System.out.println("Informe o id do cliente");
                    c.setId(javain.nextInt());
                    System.out.println("Nome:");
                    c.setNome(javain.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(javain.nextLine());
                    System.out.println("Endereço:");
                    c.setEndereco(javain.nextLine());
                    System.out.println("Telefone:");
                    c.setTelefone(javain.nextLine());
                    System.out.println("Informe sua Demanda contratada atual:");
                    c.setDemandacont(javain.nextFloat());
                    System.out.println("Informe a modalidade tarifaria atual:");
                    c.setModalidadetarif(javain.nextFloat());
                    break;
            }

        } while (opcao != 0);
    }

    private static void menu() {
        System.out.println("--- MENU ---");
        System.out.println("1 - Cadastrar cliente");
    }

}
