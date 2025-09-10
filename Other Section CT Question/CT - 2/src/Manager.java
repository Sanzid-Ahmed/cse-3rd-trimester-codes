class Manager extends Officer {
    {
        System.out.println("Manager Assigned");
    }

    double allowance;

    Manager(double baseSalary, double bonus, double allowance) {
        super(baseSalary, bonus);
        this.allowance = allowance;
    }

    double getSalary() {
        return baseSalary + bonus + allowance;
    }

    String getRole() {
        return "Manager";
    }
}