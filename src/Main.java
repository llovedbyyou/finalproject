import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Варя молодец, справилась с работой!
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Выполняется команда " + i);
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                System.out.println("Выполняется команда " + i);
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                System.out.println("Выполняется команда " + i);
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }

    }
    static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("4 - Выйти из приложения");
    }
}