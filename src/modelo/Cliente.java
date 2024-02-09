package modelo;

import java.util.Objects;


public class Cliente {

private Integer id;
private String nome;
private String cpf;
private String endereço;
private String telefone;
private Float demandacont;
private String modalidadetarif;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getModalidadetarif() {
        return modalidadetarif;
    }

    public void setModalidadetarif(String modalidadetarif) {
        this.modalidadetarif = modalidadetarif;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.cpf);
        hash = 59 * hash + Objects.hashCode(this.endereço);
        hash = 59 * hash + Objects.hashCode(this.telefone);
        hash = 59 * hash + Objects.hashCode(this.demandacont);
        hash = 59 * hash + Objects.hashCode(this.modalidadetarif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.id == other.id;
    }
    
    

}
