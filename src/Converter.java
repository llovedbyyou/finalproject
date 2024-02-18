public class Converter {
    int convertStepsToKm(int steps) {
        // Переменную можно не инициализировать сразу 0,
        // ведь мы инициализируем позже нужным нам значением
        int sm = steps * 75;
        // Java позволяет использовать нижние подчеркивания,
        // чтобы удобно взаимодействовать большими числами
        // Можно так : 100_000
        return sm / 100_000;
    }
    int convertStepsToKilocalories(int steps) {
        int calories = steps * 50;
        return calories / 1_000;
    }
}


