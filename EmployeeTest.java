abstract class Employee{
    String name;
    int age;
    String designation;
    protected double salary;
    

    public Employee(String name, int age, String designation, double salary)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
       
    }
    
  

    public abstract double CalculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee{

    double bonus;
    public Manager(String name, String designation, int age, double salary, double bonus)
    {
        super(name,age,designation,salary);
        this.bonus = bonus;
    } 

    @Override
    public double CalculateSalary()
    {
       salary = salary + bonus;
         return salary;
        
        
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Name: "+name+ " Age: "+age+ " Designation: "+designation+ " Salary  "+salary+ " Bonus: "+bonus+ " Total Salary: "+CalculateSalary());

    }
}

class Engineer extends Employee{
    double overTime;
    double rate = salary*(30*0.01);

    public Engineer (String name, String designation, int age, double salary, double overTime)
    {
        super(name,age,designation,salary);
        this.overTime = overTime;
    }

    @Override
    public double CalculateSalary()
    {
        salary = salary + rate*overTime;
        return salary;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Name: "+name+ " Age: "+age+ " Designation: "+designation+ " Salary  "+salary+ " OverTime: "+overTime+ " Total Salary: "+CalculateSalary());

}
}

public class EmployeeTest{
    public static void main(String[] args)
    {
        Manager m = new Manager("John", "Manager", 30, 50000, 10000);
        
        m.displayInfo();
        Engineer e = new Engineer("Smith", "Engineer", 25, 30000, 5);
        System.out.println("-----------------");
        e.displayInfo();
    }
}