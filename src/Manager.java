import java.util.Random;

public class Manager implements Employee{
    private Company company;
    Random random = new Random();
    private final int income = random.nextInt(140000 - 115000 + 1) + 115000;

    public Manager(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return fixSalary + ((double) income / 100 * 5);
    }

    @Override
    public String toString(){
        return "Менеджер: " + getMonthSalary();
    }
}
