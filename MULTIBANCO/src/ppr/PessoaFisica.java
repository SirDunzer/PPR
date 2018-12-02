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
public class PessoaFisica extends Cliente{
    private long cpf;
    private String profissao;

    public PessoaFisica(long id, TipoCliente tipocliente, String nome, String sobrenome, String telefone, Endereco endereco, long cpf, String profissao, Conta conta) {
        super(id, tipocliente, nome, sobrenome, telefone, endereco, conta);
        this.cpf = cpf;
        this.profissao = profissao;
    }

    /**
     * @return the cpf
     */
    public long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
