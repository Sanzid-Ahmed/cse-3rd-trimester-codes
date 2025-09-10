class Employee {
    protected String role = "Employee";
    protected double baseSalary;
    private static int employeeCount;

    Employee() {
        employeeCount++;
    }

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    String getRole() {
        return this.role;
    }

    static int getEmployeeCount() {
        return employeeCount;
    }
}