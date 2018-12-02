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
public class PessoaJuridica extends Cliente{
    private long cnpj;
    private String nomeFantasia;

    public PessoaJuridica(long id, TipoCliente tipocliente, String nome, String sobrenome, String telefone, Endereco endereco, long cnpj, String nomeFantasia, Conta conta) {
        super(id, tipocliente, nome, sobrenome, telefone, endereco, conta);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the cnjp
     */
    public long getCnpj() {
        return cnpj;
    }

    /**
     * @param cnjp the cnjp to set
     */
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
