package br.com.carlossantana.avaliacao.continuada3;

import java.util.List;



class Client {
            
    private Integer idClient;
    private String nameClient;
    private String loginClient;
    private String passwordClient;
//    private List<BankAccount> bankAccounts;

    
//    public Client(Integer idClient, String nameClient, String loginClient, String passwordClient) {
//        this.idClient = idClient;
//        this.nameClient = nameClient;
//        this.loginClient = loginClient;
//        this.passwordClient = passwordClient;
////        this.bankAccounts = bankAccounts;
//    }
//    

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getIdClient() {
        return idClient;
    }
    
   
    public String getNameClient() {
        return nameClient;
    }

    public String getLoginClient() {
        return loginClient;
    }

    public String getPasswordClient() {
        return passwordClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setLoginClient(String loginClient) {
        this.loginClient = loginClient;
    }

    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }
    
    
    
    
}
