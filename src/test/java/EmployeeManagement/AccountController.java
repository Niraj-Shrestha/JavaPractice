package EmployeeManagement;

public class AccountController {

    private AccountsImpl accounts;
    private AccountsView aView;
    public AccountController(AccountsImpl accounts, AccountsView aView){
        this.accounts = accounts;
        this.aView = aView;
    }

    public String getAccountName(){
        return accounts.getAccountName();
    }

    public void setAccountName(String accountName){
        accounts.setAccountName(accountName);
    }
    public String getAccountNumber(){
        return accounts.getAccountNumber();
    }
    public void setAccountNumber(String accountNumber){
        accounts.setAccountNumber(accountNumber);
    }
    public double getAccountBalance(){
        return accounts.getAccountBalance();
    }

    public void setAccountBalance(double accountBalance){
        accounts.setAccountBalance(accountBalance);
    }

    public void printAccountInformation(){
        aView.printAccountInformation(getAccountName(),getAccountNumber(),getAccountBalance());
    }
}
