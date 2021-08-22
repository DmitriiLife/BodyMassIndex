public class BmiService {
    public double calculate(double height, int weight) {
        double imt = weight / (height * height);
        return imt;
    }
}