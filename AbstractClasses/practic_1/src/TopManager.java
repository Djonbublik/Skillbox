public class TopManager implements Employee {
    private double salary;
    private double bonus;

    private double fixSalary;

    public TopManager(double income){
        generatorSalary(income);


    }

    private double generatorSalary(double income) {
        if(income > 10_000_000){
            fixSalary = (Math.random() * (80_000 - 40_000) + 40_000);
            bonus = fixSalary/100 * 150;
        }
        else bonus = 0;
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
