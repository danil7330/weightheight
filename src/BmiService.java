public class BmiService {
    public int calculate(double height, int weight) {
        double index = weight / (height * height);
        int bmi = (int) index;
        return bmi;
    }
}
