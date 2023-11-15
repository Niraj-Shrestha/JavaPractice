package EmployeeManagement;

import org.jetbrains.annotations.NotNull;

public class EmployeeSalary {
    public static void main(String[] args) {
        EmployeeInformationImpl eImpl = employeeDB();
        AccountsImpl eAcc = accountDB();
        EmployeeView view = new EmployeeView();
        AccountsView aView = new AccountsView();
        EmployeeController controller = new EmployeeController(eImpl, view);
        AccountController accountController = new AccountController(eAcc, aView);

        controller.printEmployeeInformation();
        System.out.println("____________________________________________");
        accountController.printAccountInformation();
        System.out.println("____________________________________________");
        controller.setEmployeeName("Updated Name");
        controller.setEmployeeSalary(10000);
        accountController.setAccountBalance(10001);
        controller.printEmployeeInformation();
        System.out.println("____________________________________________");
        accountController.printAccountInformation();

    }

    private static @NotNull EmployeeInformationImpl employeeDB() {
        EmployeeInformationImpl eServ = new EmployeeInformationImpl();
        eServ.setEmployeeID(101);
        eServ.setEmployeeName("John Doe");
        eServ.setEmployeeSalary(2000);
        return eServ;
    }

    private static @NotNull AccountsImpl accountDB() {
        AccountsImpl aServ = new AccountsImpl();
        aServ.setAccountName("John Doe");
        aServ.setAccountNumber("1234444444");
        aServ.setAccountBalance(1000);
        return aServ;
    }
}
