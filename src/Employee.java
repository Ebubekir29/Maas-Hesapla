public class Employee
{
    String name;
    int salary,workHours,hireYear;
    Employee(String name,int salary, int workHours, int hireYear){
        this.name=name;
        this.salary = salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        double tax;
        if(this.salary<1000){
            tax=0;
        }
        else if(this.salary>1000){
            tax = this.salary*0.03;
        }
        else{tax=0;}
        return tax;
    }
    public int bonus(){
        int bonus;
        if(this.workHours>40){
            bonus = (this.workHours-40)*30;
        }
        else{
            bonus=0;
        }
        return bonus;
    }
    public double raiseSalary(){
        double raisesalary;
        if(2021-hireYear<10){
            raisesalary= this.salary*0.05;
        }
        else if(2021-hireYear<20&&2021-hireYear>9){
            raisesalary = this.salary*0.10;
        }
        else if(2021-hireYear>19){
            raisesalary = this.salary*0.15;
        }else{raisesalary=0;}
        return raisesalary;
    }
    public void toString(Employee employee){
        double toplamMaas,vergilerleToplamMaas;
        vergilerleToplamMaas = this.salary+this.bonus()-this.tax();
        toplamMaas = this.salary+this.raiseSalary();
        System.out.println("Adı : " + employee.name);
        System.out.println("Maasi: " + employee.salary);
        System.out.println("Calisma Saati: " + employee.workHours);
        System.out.println("Baslangıc Yili: " + employee.hireYear);
        System.out.println("Vergi : " + employee.tax());
        System.out.println("Bonus : " + employee.bonus());
        System.out.println("Maas artisi : "+ employee.raiseSalary());
        System.out.println("Vergi ve bonuslarla toplam maas : "+ vergilerleToplamMaas);
        System.out.println("Toplam Maas : "+ toplamMaas);
    }
}
