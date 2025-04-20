import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Company yandex = new Company();
        Manager manager = new Manager(yandex, 85000);
        TopManager topManager = new TopManager(yandex, 150000);
        Operator operator = new Operator(yandex, 70000);
        yandex.setIncome(16000000);
        List<Employee> listEmployees = new ArrayList<>();

        System.out.print("Доход компании: ");
        System.out.printf("%.0f\n", yandex.getIncome());

        System.out.println();

        yandex.hire(manager);
        yandex.hire(topManager);
        yandex.hire(operator);

        System.out.println();

        yandex.fire(operator);

        for (int i = 1; i < 180; i++) {
            Employee newOperator = new Operator(yandex, 70000);
            yandex.hire(newOperator);
        }

        for (int i = 1; i < 80; i++) {
            Employee newManager = new Manager(yandex, 85000);
            yandex.hire(newManager);
        }

        for (int i = 1; i < 10; i++) {
            Employee newTopManager = new TopManager(yandex, 150000);
            yandex.hire(newTopManager);
        }

        System.out.println("Список из 15 зарплат по убыванию: ");
        for (Employee employee : yandex.getTopSalaryStaff(15)) {
            System.out.println(employee);
        }

        System.out.println("Список из 30 зарплат по возрастанию: ");
        for (Employee employee : yandex.getLowestSalaryStaff(30)) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Количество сотрудников: " + yandex.getSizeList());

        for(int i = yandex.getSizeList() / 2; i > 0; i--) {
            yandex.fire(yandex.getEmployees().get(i));
        }

        System.out.println("Количество сотрудников: " + yandex.getSizeList());
        System.out.println();

        System.out.println("Список из 15 зарплат по убыванию: ");
        for (Employee employee : yandex.getTopSalaryStaff(15)) {
            System.out.println(employee);
        }

        System.out.println("Список из 30 зарплат по возрастанию: ");
        for (Employee employee : yandex.getLowestSalaryStaff(30)) {
            System.out.println(employee);
        }
    }
}