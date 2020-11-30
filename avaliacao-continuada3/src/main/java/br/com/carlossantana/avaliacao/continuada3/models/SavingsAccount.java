package br.com.carlossantana.avaliacao.continuada3.models;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author santana
 */
public class SavingsAccount extends Account {

    private Double maxTakeOutValue = 100.00;

    public Double getMaxTakeOutValue() {
        return maxTakeOutValue;
    }

    @Override
    public void takeOut(Double takeOutValue, JLabel lbTakeOutResult) {
        //super.takeOut(takeOutValue); //To change body of generated methods, choose Tools | Templates.

        if (takeOutValue <= maxTakeOutValue) {

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
            
        } else {
            
            lbTakeOutResult.setText("Poupança: Saques devem ter valor menor que 100.00");
            lbTakeOutResult.setForeground(Color.red);

            System.out.println("Poupança: Saques devem ter valor menor que 100.00");
        }
    }

    
   

}
