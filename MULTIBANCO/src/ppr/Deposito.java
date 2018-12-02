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
public class Deposito extends Transacao{
    private long valor;

    public Deposito(long valor, Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario, Conta contaDestino) {
        super(banco, operacao, conta, cartao, usuario);
        this.valor = valor;
    }
    
    
    public void executaDeposito(){
        this.getConta().setSaldo(this.getConta().getSaldo() + valor);
    }
    
    
    /**
     * @return the valor
     */
    public long getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(long valor) {
        this.valor = valor;
    }
}
