package JavaCore.src.Hw3;

/**
 * Класс, представляющий руководителя (наследник сотрудника).
 */

    public class Manager extends Employee {
        public Manager(String name, double salary) {
            super(name, salary);
        }

        public static void promoteEmployees(Employee[] employees, double bonus) {
            for (Employee employee : employees) {
                if (!(employee instanceof Manager)) {
                    employee.setSalary(employee.getSalary() + bonus);
                }
            }
        }
    }
