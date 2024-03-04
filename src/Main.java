public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.80; //рост, см
        int weight = 80; //вес, кг
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}