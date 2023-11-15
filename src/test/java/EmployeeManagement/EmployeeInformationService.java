package EmployeeManagement;

public interface EmployeeInformationService {

    String getEmployeeName();

    int getEmployeeID();

    double getEmployeeSalary();

    void setEmployeeName(String employeeName);

    void setEmployeeID(int employeeID);

    void setEmployeeSalary(double employeeSalary);
}
