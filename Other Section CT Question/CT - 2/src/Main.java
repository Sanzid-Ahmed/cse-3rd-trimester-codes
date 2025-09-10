public class Main {
    public static void main(String[] args) {
        Employee anamika = new Employee();
        Employee farhan = new Officer(80000, 10000);
        Officer rupa = new Officer(80000, 9000);
        Employee amin = new Manager(100000, 20000, 5000);
        System.out.println("Total Number of employee: " + Employee.getEmployeeCount());
        System.out.println("farhan: " + farhan.getRole());
        System.out.println("amin: " + amin.getRole());
        System.out.println("rupa: " + ((Employee) rupa).getRole());

        System.out.println(anamika.getClass());
        System.out.println(amin.getClass());

        System.out.println("anamika: " + ((Officer) anamika).getRole());
        System.out.println("farhan" + ((Officer) farhan).getRole());

        Employee[] empl = {anamika, farhan, rupa, amin};
        printTotalSalary(empl);
    }
    static void printTotalSalary(Employee[] empl){
        double totalSalary = 0;
        for(Employee i : empl){
                if(i.getClass() == Employee.class) {
                    totalSalary += i.baseSalary;
                }
                else if(i instanceof Manager) {
                    totalSalary += ((Manager) i).getSalary();
                }
            }
            System.out.println(totalSalary);
        }
    }