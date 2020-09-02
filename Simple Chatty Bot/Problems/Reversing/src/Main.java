import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int dig1 = number / 100;
        int dig2 = number / 10 % 10;
        int dig3 = number % 10;

        if (dig3 == 0) {
            if (dig2 == 0) {
                System.out.print(dig1);
            } else {
                System.out.print(dig2);
                System.out.print(dig1);
            }
        } else {
            System.out.print(dig3);
            System.out.print(dig2);
            System.out.print(dig1);
        }


    }
}