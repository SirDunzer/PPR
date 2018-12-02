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
public class Transacao {
    private Banco banco;
    private TipoOperacao operacao;
    private Conta conta;
    private Cartao cartao;
    private TipoUsuario usuario;

    public Transacao(Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario) {
        this.banco = banco;
        this.operacao = operacao;
        this.conta = conta;
        this.cartao = cartao;
        this.usuario = usuario;
    }

    
    public boolean verificaInformacoes(Banco banco, Cliente cliente, Conta conta, Cartao cartao, TipoOperacao operacao, TipoUsuario usuario){
        if(this.banco.equals(banco)         &&
           this.cartao.equals(cartao)       &&
           this.conta.equals(conta)         &&
           this.operacao.equals(operacao)   &&
           this.usuario.equals(usuario)){
        return true;
        }
        else{
            return false;
        }
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
     * @return the operacao
     */
    public TipoOperacao getOperacao() {
        return operacao;
    }

    /**
     * @param operacao the operacao to set
     */
    public void setOperacao(TipoOperacao operacao) {
        this.operacao = operacao;
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

    /**
     * @return the usuario
     */
    public TipoUsuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(TipoUsuario usuario) {
        this.usuario = usuario;
    }
}
