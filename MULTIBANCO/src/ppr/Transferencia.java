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
public class Transferencia extends Transacao{
    private Conta contaDestino;
    private long valor;

    public Transferencia(Conta contaDestino, long valor, Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario) {
        super(banco, operacao, conta, cartao, usuario);
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    
    public boolean confereSaldo(){
         if(valor <= this.getConta().getSaldo()){
                return true;
            }
            else return false;
    }
    public boolean executaTransferencia(){
        if(this.confereSaldo()){
            this.getConta().setSaldo(this.getConta().getSaldo() - valor);
            getContaDestino().setSaldo(getContaDestino().getSaldo() + valor);
            return true;
        }
        else return false;
    }
       
    
    /**
     * @return the contaDestino
     */
    public Conta getContaDestino() {
        return contaDestino;
    }

    /**
     * @param contaDestino the contaDestino to set
     */
    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
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
