import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chỉ số cân nặng");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số cân nặng(kg): ");
        double kg = scanner.nextDouble();

        System.out.print("Nhập chiều cao(m): ");
        double m = scanner.nextDouble();

//        System.out.println("Chỉ số BMI là: " + (kg / (m)*2));

        double BMI = kg / (m)*2;
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= BMI && BMI < 25.5) {
            System.out.println("Normal");
        } else if (25.5 <= BMI && BMI < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}