import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < 270 ; ++i) {
            if (i < 10){
                company.hire(new TopManager(company.getIncome()));
            }
            else if (i > 10 & i < 80) {
                company.hire(new Manager());
            }
            else {
                company.hire(new Operator());
            }
        }
        company.getTopSalaryStaff(15);
        company.getLowestSalaryStaff(30);
        company.fire05();
        company.getTopSalaryStaff(277);
        company.getLowestSalaryStaff(30);


    }
}
