/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlossantana.avaliacao.continuada3;

/**
 *
 * @author santana
 */
public class SavingsAccount extends BankAccount {

    private Double maxTakeOutValue = 100.00;

//    public SavingsAccount(Integer idBankAccount, Integer fkClient, Double balanceBankAccount, String typeBankAccount) {
//        super(idBankAccount, fkClient, balanceBankAccount, typeBankAccount);
//    }

//    public SavingsAccount(Integer idBankAccount, Integer fkClient) {
//        super(idBankAccount, fkClient);
//    }
//
//    
    
//    public SavingsAccount(Client owner, Double balance) {
//        super(owner, balance);
//
////        this.maxTakeOutValue = maxTakeOutValue;
//    }

//    public SavingsAccount(Integer fkClient, Double balanceBankAccount) {
//        super(fkClient, balanceBankAccount);
////        this.maxTakeOutValue = maxTakeOutValue;
//        
//    }

//    public SavingsAccount(Integer idBankAccount, Integer fkClient, Double balanceBankAccount, String typeBankAccount) {
//        super(idBankAccount, fkClient, balanceBankAccount, typeBankAccount);
//        
//        this.typeBankAccount = "SavingsAccount";
//    }

    
    
    @Override
    public void takeOut(Double takeOutValue) {
        //super.takeOut(takeOutValue); //To change body of generated methods, choose Tools | Templates.

        if (takeOutValue <= maxTakeOutValue) {
            this.balanceBankAccount -= takeOutValue;
        } else {
            System.out.println("Impossível contiuar... Valor limite para saques excedido!");   
        }
    }

}
