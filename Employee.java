public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int thisYear = 2022;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        if ((this.hireYear <= 0) && (this.hireYear > this.thisYear)) {
            System.out.println("You have entered an invalid start year, please check again!");
        } else {

            if (this.thisYear - this.hireYear < 10) {
                return this.salary * 0.05;
            } else if ((this.thisYear - this.hireYear > 9) && (this.thisYear - this.hireYear < 20)) {
                return this.salary * 0.1;
            } else {
                return this.salary * 0.15;
            }
        }
        return 0;
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Salary with Tax and Bonus: " + (salary + bonus() - tax()));
        System.out.println("Total Salary: " + (salary + bonus() + raiseSalary() - tax()));
    }
}
