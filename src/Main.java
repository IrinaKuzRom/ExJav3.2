import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите свой вес в килограммах: ");
        double mass = in.nextDouble();
        System.out.print("Вы весите  " + mass + "  килограмм \n");

        System.out.print("Введите свой рост в сантиметрах: ");
        double height = in.nextDouble();
        System.out.printf("Ваш рост  " + height + " сантиметров \n");

        double indMass = service.calculate(mass, height);
        System.out.printf("Ваш индекс массы тела составляет: %.2f", (double) (Math.round(indMass * 100)) / 100);
        in.close();
    }

}
