package JavaCore.src.TaskSelector;

import JavaCore.src.Hw3.Employee;
import JavaCore.src.Hw3.Manager;

public class TaskHw3 implements Task {
    @Override
    public void execute() {
        System.out.println("Сравнение дат:");
        compareDates(2023, 5, 10, 2024, 1, 1);
        compareDates(2022, 12, 31, 2022, 12, 31);

        System.out.println("\nДо повышения зарплаты сотрудникам:");
        Employee[] employees = {
                new Employee("Иван", 50000),
                new Employee("Мария", 55000),
                new Manager("Алексей", 80000),
                new Employee("Елена", 53000)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        Manager.promoteEmployees(employees, 5000);

        System.out.println("\nПосле повышения зарплаты сотрудникам:");

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }

    private void compareDates(int y1, int m1, int d1, int y2, int m2, int d2) {
        int date1 = y1 * 10000 + m1 * 100 + d1;
        int date2 = y2 * 10000 + m2 * 100 + d2;

        String result = (Integer.compare(date1, date2) < 0) ? "Первая дата раньше" :
                (Integer.compare(date1, date2) > 0) ? "Вторая дата раньше" :
                        "Даты равны";

        System.out.println(result);
    }
}
