package inheritanceexcercise;

public class Employee  extends Person{
    
    int  employeeId;
    String department;
    Double salary;

    public Employee() {
    }

    public Employee(int employeeId, String department, Double salary, int id, String firsName, String lastName, String address, String phoneNumber) {
        super(id, firsName, lastName, address, phoneNumber);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
}
