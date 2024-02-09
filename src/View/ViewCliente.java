
package View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;
import java.util.Scanner;

public class ViewCliente {
    
    static Scanner javain = new Scanner(System.in);
    
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
}
