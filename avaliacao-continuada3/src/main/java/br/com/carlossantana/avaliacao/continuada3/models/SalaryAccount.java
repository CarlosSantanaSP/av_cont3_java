package br.com.carlossantana.avaliacao.continuada3.models;

import static br.com.carlossantana.avaliacao.continuada3.models.Account.calculateOperationCost;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author santana
 */
public class SalaryAccount extends Account {

    
    private Double excessiveSpending = 100.0;
    
    public SalaryAccount(Integer idBankAccount, Integer fkClient, Double balanceBankAccount, String typeBankAccount) {
        this.idBankAccount = idBankAccount;
        this.fkClient = fkClient;
        this.balanceBankAccount = balanceBankAccount;
        this.typeBankAccount = typeBankAccount;
    }

    
    @Override
    public void takeOut(Double takeOutValue, JLabel lbTakeOutResult) {
        System.out.println("Toma");

        Double finalValue = getBalanceBankAccount() - takeOutValue
                - calculateOperationCost(
                        takeOutValue, getOperationRate()) - this.excessiveSpending;

        this.jdbcTemplate.update("UPDATE bankAccount SET balanceBankAccount=? WHERE fkClient=?",
                finalValue,
                getFkClient()
        );

        lbTakeOutResult.setText("Salário: Saques possuem adicional de 100.00");
        lbTakeOutResult.setForeground(Color.green);

        System.out.println("UPDATE TakeOut");

//        lbTakeOutResult.setText("Impossível continuar... Valor limite para saques excedido!");
//        lbTakeOutResult.setForeground(Color.red);

//        System.out.println("Impossível continuar... Valor limite para saques excedido!");

        this.balanceBankAccount -= takeOutValue + calculateOperationCost(takeOutValue, getOperationRate());

    }

}
