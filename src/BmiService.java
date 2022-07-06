public class BmiService {
    public double calculate (double mass, double height) {
        double indBody = mass / ((height/100) * (height/100));
        return indBody;
    }
}
