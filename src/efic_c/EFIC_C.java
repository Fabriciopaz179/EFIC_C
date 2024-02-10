package efic_c;

import View.ViewCliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;

public class EFIC_C {

   static Scanner javain = new Scanner(System.in);

    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<>();
        ViewCliente viewcliente = new ViewCliente();
        menu();

        int opcao;
        do {
            System.out.println("Digite a opcao: ");
            opcao = javain.nextInt();

            switch(opcao) {
                case 0 -> System.out.println("---- PROGRAMA ENCERRADO ----");
                case 1 -> viewcliente.cadastrar(clientes);
                case 2 -> viewcliente.listar(clientes);
                case 3 -> viewcliente.alterar(clientes);
                case 4 -> viewcliente.excluir(clientes);
            }
    
        } while (opcao != 0);
    }
    private static void menu() {
        System.out.println("--- MENU ---");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Clientes cadastrados");
        System.out.println("3 - Editar cliente");
        System.out.println("4 - Excluir cliente");
        System.out.println("0 - Encerrar programa");
    }
}
