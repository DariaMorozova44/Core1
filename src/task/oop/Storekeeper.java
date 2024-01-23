package task.oop;

public class Storekeeper extends Employee{
    String name;
    int age;
    Storekeeper(String name, int age) {
        super(name, age);
        this.name=name;
        this.age=age;
    }
    public void work(){
        System.out.println("Storekeeper rabotaet na sklade");
    }
}
