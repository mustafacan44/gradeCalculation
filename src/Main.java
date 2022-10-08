import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen vize notunu giriniz");
        int midtermExam = scanner.nextInt();
        System.out.println("Lütfen final notunu giriniz");
        int finalExam = scanner.nextInt();
        int average = (midtermExam + finalExam) / 2;
        if (average < 45) {
            System.out.println("Lütfen bütünleme notunu giriniz");
            int resitExam = scanner.nextInt();
            average = (midtermExam + finalExam + resitExam) / 3;
            if (average > 45) {
                System.out.println("Tebrikler geçtiniz. Ortalama: " + average);
            } else {
                System.out.println("Maalesef kaldınız. Ortalama : " + average);
            }
        } else {
            System.out.println("Tebrikler geçtiniz. Ortalama : " + average);
        }

    }
}
