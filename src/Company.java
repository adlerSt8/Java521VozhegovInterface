import java.util.*;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private double income;

    Company() {
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return new ArrayList<>();
        } else {
            List<Employee> sorted = new ArrayList<>(employees);
            sorted.sort(Comparator.comparingDouble(Employee::getMonthSalary).reversed());
            return sorted.subList(0, count);
        }
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count <= 0 || count > employees.size()) {
            return new ArrayList<>();
        } else {
            List<Employee> sorted = new ArrayList<>(employees);
            sorted.sort(Comparator.comparingDouble(Employee::getMonthSalary));
            return sorted.subList(0, count);
        }
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getSizeList() {
        return employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
