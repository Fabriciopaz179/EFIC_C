
public class Cliente {

private String nome;
private String cpf;
private String endereço;
private String telefone;
private Float demandacont;
private Float modalidadetarif;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Float getDemandacont() {
        return demandacont;
    }

    public void setDemandacont(Float demandacont) {
        this.demandacont = demandacont;
    }

    public Float getModalidadetarif() {
        return modalidadetarif;
    }

    public void setModalidadetarif(Float modalidadetarif) {
        this.modalidadetarif = modalidadetarif;
    }

}