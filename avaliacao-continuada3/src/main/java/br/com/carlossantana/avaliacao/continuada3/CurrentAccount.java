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
public class CurrentAccount extends BankAccount {


 public CurrentAccount(Integer idBankAccount, Integer fkClient, Double balanceBankAccount, String typeBankAccount) {
        this.idBankAccount = idBankAccount;
        this.fkClient = fkClient;
        this.balanceBankAccount = balanceBankAccount;
        this.typeBankAccount = typeBankAccount;
    }
     
    @Override
    public void takeOut(Double takeOutValue) {
        //super.takeOut(takeOutValue); //To change body of generated methods, choose Tools | Templates.
        this.balanceBankAccount -= takeOutValue;
    }

}
