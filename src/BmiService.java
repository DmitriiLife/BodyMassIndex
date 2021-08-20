public class BmiService {
    public double calculate(double height) {
        double weight = 95;
        double imt = (weight / (height * height));
        return imt;
    }
}