import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kiểm tra năm nhuận");

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();

        //cách dùng não
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " là năm nhuận");
//                } else {
//                    System.out.println(year + " không phải năm nhuận");
//                }
//            } else {
//                System.out.println(year + " là năm nhuận");
//            }
//        } else {
//            System.out.println(year + " không phải năm nhuận");
//        }
//    }
            //cách không phải dùng não
        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " là năm nhuận");
        } else if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " không phải năm nhuận");
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải năm nhuận");
        }
    }
}