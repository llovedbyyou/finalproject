import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber > 0 && monthNumber <= 12) {
            System.out.println("Данные введены верно!");
        } else {
            System.out.println("Данные введены неверно");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber > 0 && dayNumber <= 30) {
            // Не очень понятно почему здесь данные сохранены,
            // хотя по факту ничего не сохранено еще
            System.out.println("Данные сохранены!");
        } else {
            System.out.println("Данные введены неверно");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps > 0) {
            System.out.println("Данные сохранены!");
        } else {
            System.out.println("Данные введены неверно");
                return;
        }
        // Очень хорошо, но можно еще лучше
        // Я бы проверил if (steps <= 0), то пишу, что данные неверны и выхожу,
        // а уже потом после условной конструкции печатаю, что данные сохранены
        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[dayNumber - 1] += steps;
    }
    void changeStepGoal() {
        // Тут какой-то слишком лютый отступ
            System.out.println("Введите новую цель по количеству шагов в день");
            int newGoalByStepsPerDay = scanner.nextInt();
            if (newGoalByStepsPerDay > 0) {
                //А здесь вообще нет отступа, хотя строки находятся в теле if'а
            goalByStepsPerDay = newGoalByStepsPerDay;
            System.out.println("Отлично! Новая цель по количеству шагов в день: " + goalByStepsPerDay);
            } else {
                // Аналогично с табуляцией проблемы
            System.out.println("Цель по количеству шагов в день должна быть больше 0");
            }
    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber > 0 && monthNumber <= 12) {
            System.out.println("Месяц введен верно!");
        } else {
            System.out.println("Месяц введён неверно");
            return;
        }
        MonthData monthData = monthToData[monthNumber - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Всего шагов пройденно за месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов за месяц: " + monthData.maxSteps());
        System.out.println("Среднее пройденное количество шагов за месяц: " + (sumSteps / 30));
        System.out.println("Пройденная за месяц дистанция в км: " + converter.convertStepsToKm(sumSteps));
        System.out.println("Количество сожжённых за месяц килокалорий: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
    }
}

