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
public class Conta {
    private long id;
    private Banco banco;
    private double saldo;
    private long limiteSaque;
    private Agencia agencia;
    private Cartao cartao;

    public Conta(long id, Banco banco, double saldo, long limiteSaque, Agencia agencia, Cartao cartao) {
        this.id = id;
        this.banco = banco;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
        this.agencia = agencia;
        this.cartao = cartao;
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
     * @return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limiteSaque
     */
    public long getLimiteSaque() {
        return limiteSaque;
    }

    /**
     * @param limiteSaque the limiteSaque to set
     */
    public void setLimiteSaque(long limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    /**
     * @return the agencia
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the cartao
     */
    public Cartao getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
