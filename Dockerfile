# Базовый образ с установленной Java
FROM openjdk:17-slim

# Установим рабочую директорию внутри контейнера
WORKDIR /app

# Копируем исходники проекта внутрь контейнера
COPY src/ ./src

# Создадим папки для выходных файлов
RUN mkdir out docs

# Компилируем Java-файлы
RUN javac -d out src/*.java

# Генерируем Javadoc-документацию
RUN javadoc -d docs src/*.java

# Пустая команда по умолчанию
CMD [ "bash" ]
