/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppr;

import java.util.Date;

/**
 *
 * @author vdunz
 */
public class Cartao{
    private long numeroCartao;
    private short codigoSeguranca;
    private long limiteCartao;
    private Date dataEmissao;
    private Date dataExpiracao;
    private char[] senha;

    public Cartao(long numeroCartao, short codigoSeguranca, long limiteCartao, Date dataEmissao, Date dataExpiracao, char[] senha) {
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
        this.limiteCartao = limiteCartao;
        this.dataEmissao = dataEmissao;
        this.dataExpiracao = dataExpiracao;
        this.senha = senha;
    }
    
    public boolean validaCartao(long numeroCartao, char[] senha){
        if(numeroCartao == this.numeroCartao && senha.equals(this.senha)){
            return true;
        }
        else return false;
    }
    
    
    
    /**
     * @return the numeroCartao
     */
    public long getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the codigoSeguranca
     */
    public short getCodigoSeguranca() {
        return codigoSeguranca;
    }

    /**
     * @param codigoSeguranca the codigoSeguranca to set
     */
    public void setCodigoSeguranca(short codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    /**
     * @return the limiteCartao
     */
    public long getLimiteCartao() {
        return limiteCartao;
    }

    /**
     * @param limiteCartao the limiteCartao to set
     */
    public void setLimiteCartao(long limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    /**
     * @return the dataEmissao
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the dataExpiracao
     */
    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    /**
     * @param dataExpiracao the dataExpiracao to set
     */
    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    /**
     * @return the senha
     */
    public char[] getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(char[] senha) {
        this.senha = senha;
    }
}
