package JavaCore.src.TaskSelector;

/**
 * Перечисление доступных задач.
 */
public enum Task {
    SALARY_RAISE(2, "Выполнение домашнего задания по уроку 2: Данные и функции.") {
        @Override
        public void run() {
            TaskSelector.runTask2();
        }
    },
    DATE_COMPARISON(3, "Выполнение домашнего задания по уроку 3: Классы и объекты.") {
        @Override
        public void run() {
            TaskSelector.runTask3();
        }
    };

    private final int number;
    private final String description;

    Task(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public abstract void run();

    public static Task getByNumber(int number) {
        for (Task task : values()) {
            if (task.number == number) {
                return task;
            }
        }
        return null;
    }
}
