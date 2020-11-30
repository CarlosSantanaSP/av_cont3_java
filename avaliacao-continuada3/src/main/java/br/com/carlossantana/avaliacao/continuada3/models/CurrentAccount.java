package br.com.carlossantana.avaliacao.continuada3.models;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author santana
 */
public class CurrentAccount extends Account {

    public CurrentAccount(Integer idBankAccount, Integer fkClient, Double balanceBankAccount, String typeBankAccount) {
        this.idBankAccount = idBankAccount;
        this.fkClient = fkClient;
        this.balanceBankAccount = balanceBankAccount;
        this.typeBankAccount = typeBankAccount;
    }


    @Override
    public void takeOut(Double takeOutValue, JLabel lbTakeOutResult) {

        Double finalValue = getBalanceBankAccount() - takeOutValue
                - calculateOperationCost(
                        takeOutValue, getOperationRate());

        this.jdbcTemplate.update("UPDATE bankAccount SET balanceBankAccount=? WHERE fkClient=?",
                finalValue,
                getFkClient()
        );

        lbTakeOutResult.setText("Saque realizado com sucesso");
        lbTakeOutResult.setForeground(Color.green);

        System.out.println("UPDATE TakeOut");

        this.balanceBankAccount -= takeOutValue + calculateOperationCost(takeOutValue, getOperationRate());

    }

}
