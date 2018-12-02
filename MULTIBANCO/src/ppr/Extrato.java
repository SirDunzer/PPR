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
public class Extrato extends Transacao{
    private Date dataInicio;
    private Date dataFinal;

    public Extrato(Date dataInicio, Date dataFinal, Banco banco, TipoOperacao operacao, Conta conta, Cartao cartao, TipoUsuario usuario) {
        super(banco, operacao, conta, cartao, usuario);
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public boolean mostraEmTela(Conta conta){
        System.out.println("\n\tExtrato\t\n");
        System.out.println("R$"+conta.getSaldo());
        return true;
    }
    
    public boolean imprimeExtrato(Conta conta){
        return true;
    }
    
    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFinal
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
}
