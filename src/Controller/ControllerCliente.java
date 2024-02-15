
package Controller;

import java.util.List;
import modelo.Cliente;
import java.util.ArrayList;

public class ControllerCliente {
    
    public Cliente salvar(Integer id, String nome, String cpf, String endereco, String telefone, Float demandacont, String modalidadetarif){
        Cliente cliente = new Cliente(id, nome, cpf, endereco, telefone, demandacont, modalidadetarif);
        return cliente;
    
    }
    public List<Cliente> listar(){
        return new ArrayList<>();
    }
    
    public static Integer buscarClienteById(List<Cliente> clientes, Integer idCliente) {
        Integer posicao = null;
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