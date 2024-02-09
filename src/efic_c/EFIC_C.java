package efic_c;

public class EFIC_C {

   static Scanner javain = new Scanner(System.in);

    public static void main(String[] args) {
        
        List<Cliente> clientes = new ArrayList<>();
        menu();

        int opcao;
        do {
            System.out.println("Digite a opcao: ");
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
                    javain.nextLine();
                    System.out.println("Nome:");
                    c.setNome(javain.nextLine());
                    System.out.println("CPF:");
                    c.setCpf(javain.nextLine());
                    System.out.println("Endereco:");
                    c.setEndereco(javain.nextLine());
                    System.out.println("Telefone:");
                    c.setTelefone(javain.nextLine());
                    System.out.println("Informe sua Demanda contratada atual:");
                    c.setDemandacont(javain.nextFloat());
                    javain.nextLine();
                    System.out.println("Informe a modalidade tarifaria atual:");
                    c.setModalidadetarif(javain.nextLine());
                    clientes.add(c);
                    break;
                    
                case 2:
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
                    break;
                    
                case 3:
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
                    } else {
                        System.out.println("NAO EXISTE CLIENTE CADASTRADO COM ESSA ID!");
                    }
                    break;
                case 4:
                    System.out.println("---- EXCLUIR CLIENTE ----");
                    Integer posicao = buscarClienteById(clientes);
                    if(posicao!=null){
                        clientes.remove(clientes.get(posicao));
                        System.out.println("CLIENTE EXCLUÍDO COM SUCESSO!");
                    }else{
                        System.out.println("CLIENTE NÃO ENCONTRADO!");
                    }
                    break;
                default:
                    System.out.println("---- OPÇÃO INVÁLIDA ----");

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

    private static Integer buscarClienteById(List<Cliente> clientes) {
        Integer posicao = null;
        System.out.println("Digite a id do cliente: ");
        Integer idCliente = javain.nextInt();
        javain.nextLine();
       
         for(int i=0; i<clientes.size(); i++){    
             Cliente cliente = clientes.get(i);
             if (cliente.getId().equals(idCliente)) {
                posicao = i;
                break;
            }
        }
        return posicao;
    } 
}
