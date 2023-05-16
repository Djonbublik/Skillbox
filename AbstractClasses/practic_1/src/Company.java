import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Company {
    private ArrayList<Employee> company = new ArrayList<>();

    public double getIncome() {
        return ((Math.random() * (11_000_000)) + 9_000_000);
    }


    public ArrayList<Employee> getTopSalaryStaff(int cout) {//сотруднии с высокими зарплатами
        ArrayList<Employee> companyTopSalaryStaff = new ArrayList<>();
        if (cout <= company.size()){
        Collections.sort(company);
        String listSalary = "";
        for (int i = 0; i < cout; i++) {
            companyTopSalaryStaff.add(company.get(i));
            listSalary = listSalary + company.get(i);

        }
        System.out.println("Список самых высоких зп : " + listSalary);
        return companyTopSalaryStaff;}
        else {
            System.out.println("Указанно не коректное количество сотрудников");
        }
        return companyTopSalaryStaff;
    }


    public ArrayList<Employee> getLowestSalaryStaff(int cout) { //сотрудники с нищзкими зп
        ArrayList<Employee> companyLowersSalaryStaff = new ArrayList<>();
        if (cout <= company.size()){
        Collections.sort(company);
        Collections.reverse(company);
        String listSalary = "";
        for (int i = 0; i < cout; i++) {
            companyLowersSalaryStaff.add(company.get(i));
            listSalary = company.get(i).toString() + listSalary;

        }
        Collections.reverse(companyLowersSalaryStaff);
        System.out.println("Список самых низких зп : " + listSalary);}
        else {
            System.out.println("Указанно не коректное количество сотрудников");
        }

        return companyLowersSalaryStaff;
    }

    public void hire(Employee employee) {
        company.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        company.addAll(employees);
    }

    public void fire(Employee employee) {
        company.remove(employee);

    }

    public void fire05(){
        for (int i = company.size()/2; i > 0; i--) {
            company.remove((int)((Math.random() * company.size())));
        }
    }


    @Override
    public String toString() {
        System.out.println(company.size());
return super.toString();
    }


}
