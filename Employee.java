public class Employee {
String name;
int id;
double salary;
public Employee(String name, int id,double salary,int number){
    this.name=name;
    this.id=id;
    this.salary=salary;
    this.number=number;
}
public void displayInfo(){
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Name:"+name);
    System.out.println("Salary:"+salary);
    System.out.println("number:"+number);
}
public static void main(String[] args) {
    Employee emp1=new Employee("xyz", 101, 10000.0,11122233);
    emp1.displayInfo();
}
}
