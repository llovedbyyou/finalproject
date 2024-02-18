public class Converter {
    int convertStepsToKm(int steps) {
        int km = 0;
        int sm = steps * 75;
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
