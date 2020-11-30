package br.com.carlossantana.avaliacao.continuada3.models;

import br.com.carlossantana.avaliacao.continuada3.DataBase;
import java.awt.Color;
import javax.swing.JLabel;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author santana
 */
public abstract class Account {

    protected static JdbcTemplate jdbcTemplate = new DataBase().connect();

    protected Integer idBankAccount;
    protected Integer fkClient;
    protected Double balanceBankAccount;
    protected String typeBankAccount;
    
    protected final Double operationRate = 0.05;

    public abstract void takeOut(Double takeOutValue, JLabel operationResult);

    public void deposit(Double depositValue, JLabel lbDepositResult) {

        
        Double operationCost = calculateOperationCost(depositValue, getOperationRate());

        Double finalValue = getBalanceBankAccount() + depositValue - operationCost;

//        bankAccount.deposit(depositValue);
        this.jdbcTemplate.update("UPDATE bankAccount SET balanceBankAccount=? WHERE fkClient=?",
                finalValue,
                getFkClient()
        );

        lbDepositResult.setText("Deposito realizado com sucesso");
        lbDepositResult.setForeground(Color.green);
        
        System.out.println("UPDATE Deposit");

        this.balanceBankAccount = depositValue - calculateOperationCost(depositValue, getOperationRate());
    }

    public static Double calculateOperationCost(Double operationValue, Double operationRate) {
        Double cost = operationValue * operationRate;
        return cost;
    }

    public Double getOperationRate() {
        return operationRate;
    }

    public Integer getIdBankAccount() {
        return idBankAccount;
    }

    public void setIdBankAccount(Integer idBankAccount) {
        this.idBankAccount = idBankAccount;
    }

    public void setFkClient(Integer fkClient) {
        this.fkClient = fkClient;
    }

    public Integer getFkClient() {
        return fkClient;
    }

    public Double getBalanceBankAccount() {
        return balanceBankAccount;
    }

    public String getTypeBankAccount() {
        return typeBankAccount;
    }

    public void setBalanceBankAccount(Double balanceBankAccount) {
        this.balanceBankAccount = balanceBankAccount;
    }

    public void setTypeBankAccount(String typeBankAccount) {
        this.typeBankAccount = typeBankAccount;
    }

}
