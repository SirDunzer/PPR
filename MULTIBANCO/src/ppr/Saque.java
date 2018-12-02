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
public class Saque extends Transacao{
    private long valor;

    public Saque(Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario, long valor) {
        super(banco, operacao, conta, cartao, usuario);
        this.valor = valor;
    }
    
    public void calculaCedulas(long valor){
        long notas50 = valor / 50;
        long aux = valor % 50;
        
    }
    
    private void distribuiCeludas(){
        if(confereSaldo()){
            //Distribui Cedulas;
        }
    }
    
    private boolean confereSaldo(){
        if(valor <= this.getCartao().getLimiteCartao()){
            if(valor <= this.getConta().getSaldo()){
                return true;
            }
        }
        else return false;
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
