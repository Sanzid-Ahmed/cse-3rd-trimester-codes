class Officer extends Employee {
    static {
        System.out.println("Officer Recruitment Started");
    }

    {
        System.out.println("An Officer is Recruited");
    }

    double bonus;

    Officer(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
        this.role = "Officer";
    }

    double getSalary() {
        return baseSalary + bonus;
    }
}