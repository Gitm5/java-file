package tutorial6;

public class employeeAccess {
    protected int salary;

protected employeeAccess(int salary) {
    this.salary = salary;
}

protected void showSalary() {
    System.out.println("Salary: " + salary);
}

}
class manager{
    public static void main(String[] args) {
        
    
    employeeAccess emp=new employeeAccess(100000);

    emp.showSalary();
}
}
