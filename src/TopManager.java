public class TopManager implements Employee{
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10_000_000) {
            return fixSalary + (fixSalary * 1.5);
        } else return fixSalary;
    }

    @Override
    public String toString(){
        return "Топ менеджер: " + getMonthSalary();
    }
}
