import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int natural = 1;
        while (natural * natural <= number) {
            System.out.println(natural * natural);
            natural++;
        }
    }
}