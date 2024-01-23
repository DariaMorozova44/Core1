package task.oop;

public class Manager extends Employee{
    String name;
    int age;
    Manager(String name, int age) {
        super(name, age);
        this.name=name;
        this.age=age;
    }
    public void work(){
        System.out.println("Manager rabotaet v kompanii");
    }
}
