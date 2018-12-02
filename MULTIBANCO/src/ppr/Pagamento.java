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
public class Pagamento extends Transacao{
    private long codigoFatura;
    private long valorFatura;
    private double valorParcela;
    private int parcelas;

    public Pagamento(long codigoFatura, long valorFatura, int parcelas, Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario) {
        super(banco, operacao, conta, cartao, usuario);
        this.codigoFatura = codigoFatura;
        this.valorFatura = valorFatura;
        this.parcelas = parcelas;
        this.valorParcela = (double) valorFatura / parcelas;
    }

    public boolean confereSaldo(){
         if(valorParcela <= this.getConta().getSaldo()){
                return true;
            }
            else return false;
    }
    
    public boolean executaPagamento(){
            if(this.confereSaldo()){
                this.getConta().setSaldo(this.getConta().getSaldo() - valorParcela);
                return true;
            }
            else return false;
        }
    
    
    /**
     * @return the codigoFatura
     */
    public long getCodigoFatura() {
        return codigoFatura;
    }

    /**
     * @param codigoFatura the codigoFatura to set
     */
    public void setCodigoFatura(long codigoFatura) {
        this.codigoFatura = codigoFatura;
    }

    /**
     * @return the valorFatura
     */
    public long getValorFatura() {
        return valorFatura;
    }

    /**
     * @param valorFatura the valorFatura to set
     */
    public void setValorFatura(long valorFatura) {
        this.valorFatura = valorFatura;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
