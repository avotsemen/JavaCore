package JavaCore.src.TaskSelector;

import JavaCore.src.Hw4.Employee;
import JavaCore.src.Hw4.Holiday;
import JavaCore.src.Hw4.Customer;

public class TaskHw4 implements Task {
    @Override
    public void execute() {
        Employee[] employees = {
                new Employee("Алексей", 50000, Customer.Gender.MALE),
                new Employee("Мария", 55000, Customer.Gender.FEMALE),
                new Employee("Иван", 48000, Customer.Gender.MALE),
                new Employee("Екатерина", 60000, Customer.Gender.FEMALE)
        };

        // Пример: сегодня Новый год
        Holiday todayHoliday = Holiday.MARCH_8;

        congratulate(employees, todayHoliday);
    }

    private void congratulate(Employee[] employees, Holiday holiday) {
        for (Employee employee : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("Поздравляем " + employee.getName() + " с Новым Годом!");
                    break;
                case MARCH_8:
                    if (employee.getGender() == Customer.Gender.FEMALE) {
                        System.out.println("Поздравляем " + employee.getName() + " с 8 марта!");
                    }
                    break;
                case FEBRUARY_23:
                    if (employee.getGender() == Customer.Gender.MALE) {
                        System.out.println("Поздравляем " + employee.getName() + " с 23 февраля!");
                    }
                    break;
                default:
                    System.out.println("Сегодня нет праздника для " + employee.getName());
                    break;
            }
        }
    }
}
