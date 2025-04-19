public class Operator implements Employee {
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return fixSalary;
    }

    @Override
    public String toString() {
        return "Оператор: " + getMonthSalary();
    }
}
