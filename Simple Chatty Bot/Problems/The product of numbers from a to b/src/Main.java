import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long counter = 1;
        for (int i = a; i < b; i++) {
            counter *= i;
        }
        System.out.println(counter);
    }
}