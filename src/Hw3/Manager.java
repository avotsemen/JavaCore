package JavaCore.src.Hw3;

/**
 * Класс, представляющий руководителя (наследник сотрудника).
 */
public class Manager extends Employee {

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    /**
     * Статический метод для повышения зарплаты всем сотрудникам, кроме руководителей.
     *
     * @param employees массив сотрудников
     * @param percent   процент повышения
     */
    public static void raiseSalaryForAll(Employee[] employees, double percent) {
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                e.raiseSalary(percent);
            }
        }
    }
}

