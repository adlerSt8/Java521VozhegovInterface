public class TopManager implements Employee{
    private Company company;
    private int fixSalary;

    public TopManager(Company company, int fixSalary) {
        this.company = company;
        this.fixSalary = fixSalary;
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
