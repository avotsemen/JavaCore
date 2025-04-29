package JavaCore.src.TaskSelector;

public enum TaskType {
    HOMEWORK_2(2, "Выполнение домашнего задания по уроку 2: Данные и функции"),
    HOMEWORK_3(3, "Выполнение домашнего задания по уроку 3: Классы и объекты"),
    HOMEWORK_4(4, "Выполнение домашнего задания по уроку 4: Обработка исключений"),
    HOMEWORK_5(5, "Выполнение домашнего задания по уроку 5: Тонкости работы");

    private final int number;
    private final String description;

    TaskType(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public static TaskType fromNumber(int number) {
        for (TaskType task : values()) {
            if (task.getNumber() == number) {
                return task;
            }
        }
        return null;
    }
}

