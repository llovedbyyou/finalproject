public class Converter {
    int convertStepsToKm(int steps) {
        int sm = steps * 75;
        return sm / 100_000;
    }
    int convertStepsToKilocalories(int steps) {
        int calories = steps * 50;
        return calories / 1_000;
    }
}


