
package View;

import Controller.ControllerCliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;

public class ViewCliente {
    
    static Scanner javain = new Scanner(System.in);
    ControllerCliente controle = new ControllerCliente();
    public Cliente cliente;
    
    public void cadastrar(List<Cliente> clientes){
        Integer id;
        String nome;
        String cpf;
        String endereco;
        String telefone;
        Float demandacont;
        String modalidadetarif;
        
        javain.nextLine();         
        System.out.println("--- Cadastrar Cliente ---");
        System.out.println("Informe o id do cliente");
        id = javain.nextInt();
        javain.nextLine();
        System.out.println("Nome:");
        nome = javain.nextLine();
        System.out.println("CPF:");
        cpf = javain.nextLine();
        System.out.println("Endereco:");
        endereco = javain.nextLine();
        System.out.println("Telefone:");
        telefone = javain.nextLine();
        System.out.println("Informe sua Demanda contratada atual:");
        demandacont = javain.nextFloat();
        javain.nextLine();
        System.out.println("Informe a modalidade tarifaria atual:");
        modalidadetarif = javain.nextLine(); 
        clientes.add(cliente);
    }
    
    public void listar(List<Cliente> clientes) {
        System.out.println("--- CLIENTES CADASTRADOS ---");
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Endereco: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Demanda ATUAL: " + cliente.getDemandacont());
            System.out.println("Modalidade tarifaria ATUAL: " + cliente.getModalidadetarif() + "\n");
        }
    }
        
    public void alterar(List<Cliente> clientes){
        System.out.println("---- ALTERAR CLIENTE ----");
        System.out.println("Digite a id do cliente: ");
        Integer idCliente = javain.nextInt();
        Boolean encontrou = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idCliente) {
                javain.nextLine();
                System.out.println("Digite o nome: ");
                cliente.setNome(javain.nextLine());
                System.out.println("Digite o CPF: ");
                cliente.setCpf(javain.nextLine());
                System.out.println("Digite o Endereco: ");
                cliente.setEndereco(javain.nextLine());
                System.out.println("Digite o Telefone: ");
                cliente.setTelefone(javain.nextLine());
                System.out.println("Informe sua Demanda contratada atual:");
                cliente.setDemandacont(javain.nextFloat());
                javain.nextLine();
                System.out.println("Informe a modalidade tarifaria atual:");
                cliente.setModalidadetarif(javain.nextLine());
                encontrou = true;
                break;
                }
            }
            if (encontrou) {
                System.out.println("CLIENTE ALTERADO COM SUCESSO!");
            } 
            else {
                System.out.println("NAO EXISTE CLIENTE CADASTRADO COM ESSA ID!");
            }
    }
    
    public void excluir(List<Cliente> clientes){
        System.out.println("---- EXCLUIR CLIENTE ----");
        System.out.println("Digite a id do cliente: ");
        Integer idCliente = javain.nextInt();
        javain.nextLine();
        Integer posicao = controle.buscarClienteById(clientes,idCliente);
        if (posicao != null) {
            clientes.remove(clientes.get(posicao));
            System.out.println("CLIENTE EXCLUÍDO COM SUCESSO!");
        } else {
            System.out.println("CLIENTE NÃO ENCONTRADO!");
        }
    }
    
}
