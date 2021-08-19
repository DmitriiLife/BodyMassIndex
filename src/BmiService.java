public class BmiService {
    public int calculate(double cost) {
        double weight = 95;
        double imt = weight / (cost * cost);
        return (int) imt;
    }

}