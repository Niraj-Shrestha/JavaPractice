package EmployeeManagement;

public interface AccountsService {

    String getAccountNumber();

    String getAccountName();

    double getAccountBalance();

    void setAccountNumber(String accountNumber);
    void setAccountName(String accountName);
    void setAccountBalance(double accountBalance);
}
