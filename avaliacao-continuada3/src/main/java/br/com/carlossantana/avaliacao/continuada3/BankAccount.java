package br.com.carlossantana.avaliacao.continuada3;

/**
 *
 * @author santana
 */
public abstract class BankAccount {

//    protected final Integer idBankAccount;
//    protected final Integer fkClient;
//    protected Double balanceBankAccount;
//    protected String typeBankAccount;
    protected Integer idBankAccount;
    protected Integer fkClient;
    protected Double balanceBankAccount;
    protected String typeBankAccount;
    protected final Double operationRate = 0.05;

    
    
    public abstract void takeOut(Double takeOutValue);

    public void deposit(Double depositValue) {

        this.balanceBankAccount += depositValue;
        this.balanceBankAccount -= calculateOperationCost(depositValue, getOperationRate());
        
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
