public class Converter {
    int convertStepsToKm(int steps) {
        // Переменную можно не инициализировать сразу 0,
        // ведь мы инициализируем позже нужным нам значением
        int km = 0;
        int sm = steps * 75;
        // Java позволяет использовать нижние подчеркивания,
        // чтобы удобно взаимодействовать большими числами
        // Можно так : 100_000
        km = sm / 100000;
        return km;
    }
    int convertStepsToKilocalories(int steps) {
        int kilocalories = 0;
        int calories = steps * 50;
        kilocalories = calories / 1000;
        return kilocalories;
    }
}
