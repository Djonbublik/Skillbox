public interface Employee extends Comparable<Employee> {
    public double getMountSalary();

    default int compareTo(Employee o){
        return Integer.compare((int) o.getMountSalary(), (int) this.getMountSalary());
    }

}
