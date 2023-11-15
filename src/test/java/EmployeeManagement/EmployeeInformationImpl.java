package EmployeeManagement;

public class EmployeeInformationImpl implements EmployeeInformationService {

    private String employeeName;
    private int employeeID;
    private double employeeSalary;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public double getEmployeeSalary() {
        return employeeSalary;
    }
}
