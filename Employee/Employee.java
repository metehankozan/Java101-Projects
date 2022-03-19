package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary > 1000){
            return this.salary * .03;
        }
        return 0;
    }

    int bonus(){
        int extraHours = this.workHours - 40;
        if(extraHours > 0){
            return extraHours * 30;
        }
        return 0;
    }

    double raiseSalary(){
        int workingYears = 2022 - this.hireYear;
        if(workingYears < 10){
            return this.salary * .05;
        }else if(workingYears < 20){
            return this.salary * .10;
        }else{
            return this.salary * .15;
        }
    }
    
    @Override
    public String toString(){
        double totalSalary = this.salary + this.raiseSalary();
        double salaryWithTaxAndBonus = this.salary + this.bonus() - this.tax();
        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + this.tax() +
                "\nBonus: " + this.bonus() +
                "\nMaaş Artışı: " + this.raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}
