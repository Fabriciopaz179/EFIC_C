package modelo;


public class Cliente {

private int id;
private String nome;
private String cpf;
private String endereço;
private String telefone;
private Float demandacont;
private Float modalidadetarif;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
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

    public String getEndereco() {
        return endereço;
    }

    public void setEndereco(String endereço) {
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
