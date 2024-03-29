/*
Create a class Person with attributes name and age. Derive a class Employee from Person with additional attributes employeeId and salary.
Create objects of both classes and demonstrate how inheritance works in accessing the attributes of the base class.
*/

class person{
    String name;
    int age;

    person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displaydata(){
        System.out.print("Employee Name: "+name);
        System.out.print("\nEmployee Age: "+age);
    }
}
class Employee extends person{
    int eid,salary;
    Employee(String name, int age, int eid, int salary){
        super(name, age);
        this.eid = eid;
        this.salary = salary;
    }
    void displaydata1(){
        System.out.print("\nEmployee ID: "+eid);
        System.out.print("\nEmployee Salary: "+salary);

    }
}

public class Exp18 {
    public static void main(String[] args) {
        Employee xyz = new Employee("Sarjak",19,101,10000);
        xyz.displaydata();
        xyz.displaydata1();

    }
    
}
