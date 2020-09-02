import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        boolean thousand = false;
        while (num != 0) {
            sum += num;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                thousand = true;
                break;
            }
            num = sc.nextInt();
        }
        if (!thousand) {
            System.out.println(sum);
        }
    }
}