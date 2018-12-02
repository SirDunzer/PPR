/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppr;

/**
 *
 * @author vdunz
 */
public class Cliente {
    private long id;
    private TipoCliente tipoCliente;
    private String nome;
    private String sobrenome;
    private String telefone;
    private Endereco endereco;
    private Conta conta;

    public Cliente(long id, TipoCliente tipocliente, String nome, String sobrenome, String telefone, Endereco endereco, Conta conta){
        this.id = id;
        this.tipoCliente = tipoCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.conta = conta;
        if(tipoCliente.equals(TipoCliente.PESSOA_FISICA)){
            //TODO code here
        }
        else if(tipoCliente.equals(TipoCliente.PESSOA_JURIDICA)){
            //TODO code here
        }
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the cliente
     */
    public TipoCliente getCliente() {
        return tipoCliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the conta
     */
    public Conta getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
