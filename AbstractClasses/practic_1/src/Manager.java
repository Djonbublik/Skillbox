public class Manager implements Employee {
    private double salary;
    private double bonus;
    private double income;
    private double fixSalary;





    public Manager(){
        generateSalary();
    }


    public double generateSalary(){
        income = (Math.random() * (140_000 - 115_000) + 115_000);
        bonus = income * 0.05;
        fixSalary = (Math.random() * (60_000 - 30_000) + 30_000);
        salary = fixSalary + bonus;
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
