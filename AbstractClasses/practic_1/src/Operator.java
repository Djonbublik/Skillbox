public class Operator implements Employee {


    private double salary;

    public Operator(){
        generatorSalary();
    }
    public double generatorSalary(){
        salary = ((Math.random() * (60_000 - 30_000) + 30_000));
        return salary;
    }

    @Override
    public double getMountSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\n" + (int)salary + "руб.";
    }
}
