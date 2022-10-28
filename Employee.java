public class Employee {
    String name;
    float salary;
    int workHours;
    int hireYear;
    Employee(String name,float salary,int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    float tax(float maas) {
        if (maas < 1000) {
            return 0;
        }
        else
            return (maas/100) * 3;
    }
    int bonus(int saat){
        if (saat > 40){
            saat = saat - 40;
            return saat * 30;
        }
        else
            return 0;
    }
    float raiseSalary(int yil, float maas){
        yil = 2021 - yil;
        if (yil < 10){
            return (maas/100) * 5;
        }
        else if (yil > 9 && yil <20){
            return (maas/100) * 10;
        }
        else
            return (maas/100) * 15;
    }
    void toPrint(){
        System.out.println("Adı:\t " + this.name);
        System.out.println("Maaşı:\t " + this.salary);
        System.out.println("Çalışma Saati:\t " + this.workHours);
        System.out.println("Başlangıç Yılı:\t " + this.hireYear);
        System.out.println("Vergi:\t " + tax(this.salary));
        System.out.println("Bonus:\t " + bonus(this.workHours));
        System.out.println("Maaş Artışı:\t " + raiseSalary(this.hireYear, this.salary));
        System.out.println("Vergi Ve Bonuslar İle Birlikte Maaş:\t " + (this.salary - (tax(this.salary)- bonus(this.workHours))));
        System.out.println("Toplam Maaş:\t " + (this.salary + raiseSalary(this.hireYear, this.salary)));
    }
    public static void main(String[] args){
        Employee employee = new Employee("kemal", 2000, 45, 1985);
        employee.toPrint();
    }
}
