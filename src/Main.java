public class Main {
    public static void main(String[] args) {
        BmiService servic = new BmiService();

        int weightKg = 98;
        double heightSm = 187;
        int bmi = servic.calculate(weightKg, heightSm);


        System.out.println(bmi);
    }
}