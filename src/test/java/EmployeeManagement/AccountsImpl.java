package EmployeeManagement;

public class AccountsImpl implements AccountsService {

    private String accountNumber;
    private String accountName;
    private double accountBalance;

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountName() {
        return accountName;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
