public class BmiService {
    public int calculate(int weightKg, double heightSm) {
        return (int) (weightKg / heightSm / heightSm *10000);
    }
}
