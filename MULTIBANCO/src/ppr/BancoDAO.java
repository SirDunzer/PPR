/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppr;

import java.util.LinkedList;

/**
 *
 * @author vdunz
 */
public class BancoDAO {
    private LinkedList<Cliente> clientes = new LinkedList<>();
    private char[] senha = new char[] { 'a', 's', 'd', 'f'};
    private Cartao cartaoMiguel = new Cartao(123456, (short) 000, 1000, null, null,senha);
    private Conta contaMiguel = new Conta(123456, null, 10000, 1000, null, cartaoMiguel);
    private Cliente Dunzer = new Cliente(314159, TipoCliente.PESSOA_JURIDICA, "Vitor", "Dunzer", "0000000", null, null);
    private Cliente Miguel = new Cliente(123456, TipoCliente.PESSOA_FISICA, "Miguel", "Nunes", "123456", null, contaMiguel);
    
    
    public BancoDAO() {
        clientes.add(Dunzer);
        clientes.add(Miguel);
    }
    
    public boolean buscaCliente(long id){
        for(int i = 0; i < clientes.lastIndexOf(clientes); i++){
            if(clientes.get(i).getConta().getCartao().getNumeroCartao() == id) 
                return true;
        }
        return false;
    }
    
    
    public BancoDAO(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    
    public LinkedList<Cliente> getClientes() {
        return clientes;
    }
    
    public boolean addCliente(Cliente cliente){
        this.clientes.add(cliente);
        return true;
    }
    
    public boolean excluiCliente(Cliente cliente){
        this.clientes.remove(cliente);
        return true;
    }

}
