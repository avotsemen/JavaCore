package JavaCore.src.Hw3;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee {
    private String name;
    private double salary;
    private int year;
    private int month;
    private int day;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    /**
     * Сравнивает две даты без использования условных операторов (if, switch).
     *
     * @param year1  первый год
     * @param month1 первый месяц
     * @param day1   первый день
     * @param year2  второй год
     * @param month2 второй месяц
     * @param day2   второй день
     * @return отрицательное число, если первая дата раньше, положительное — если позже, 0 — если даты равны
     */
    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        int value1 = year1 * 10000 + month1 * 100 + day1;
        int value2 = year2 * 10000 + month2 * 100 + day2;
        return Integer.compare(value1, value2); // без явного if
    }
}
