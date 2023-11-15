package EmployeeManagement;

public class EmployeeController {
    private EmployeeInformationImpl employeeInformation;
    private EmployeeView view;

    public EmployeeController(EmployeeInformationImpl employeeInformation, EmployeeView view) {
        this.employeeInformation = employeeInformation;
        this.view = view;
    }

    public String getEmployeeName() {
        return employeeInformation.getEmployeeName();
    }

    ;

    public void setEmployeeName(String employeeName) {
        employeeInformation.setEmployeeName(employeeName);
    }

    public int getEmployeeID() {
        return employeeInformation.getEmployeeID();
    }

    public void setEmployeeID(int ID) {
        employeeInformation.setEmployeeID(ID);
    }

    public double getEmployeeSalary() {
        return employeeInformation.getEmployeeSalary();
    }

    public void setEmployeeSalary(double salary) {
        employeeInformation.setEmployeeSalary(salary);
    }

    public void printEmployeeInformation() {
        view.PrintEmployeeDetails(getEmployeeName(), getEmployeeID(), getEmployeeSalary());
    }
}
