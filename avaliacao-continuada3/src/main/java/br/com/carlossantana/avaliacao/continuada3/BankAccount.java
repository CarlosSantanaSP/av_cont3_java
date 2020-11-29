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
    protected Double operationRate = 0.10;

//    public BankAccount(Integer idBankAccount, Integer fkClient) {
//        this.idBankAccount = idBankAccount;
//        this.fkClient = fkClient;        
//    }
    public Integer getIdBankAccount() {
        return idBankAccount;
    }

    public abstract void takeOut(Double takeOutValue);

    public void deposit(Double depositValue) {

        this.balanceBankAccount += depositValue;
        this.balanceBankAccount -= verifyOperationCost(depositValue);
        
        
        
    }

    public Double verifyOperationCost(Double operationValue) {

        Double cost = operationValue * this.operationRate;

        return cost;
    }

//    public Integer getIdBankAccount() {
//        return idBankAccount;
//    }
    public Integer getFkClient() {
        return fkClient;
    }

    public Double getBalanceBankAccount() {
        return balanceBankAccount;
    }

    public String getTypeBankAccount() {
        return typeBankAccount;
    }

//    public void setIdBankAccount(Integer idBankAccount) {
//        this.idBankAccount = idBankAccount;
//    }
    public void setBalanceBankAccount(Double balanceBankAccount) {
        this.balanceBankAccount = balanceBankAccount;
    }

    public void setTypeBankAccount(String typeBankAccount) {
        this.typeBankAccount = typeBankAccount;
    }

}
