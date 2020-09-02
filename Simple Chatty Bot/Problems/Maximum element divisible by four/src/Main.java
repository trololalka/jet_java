import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = 0;
        for (int i = 0, tmp = 0; i < count; i++) {
            tmp = sc.nextInt();
            if (max < tmp && tmp % 4 == 0) {
                max = tmp;
            }
        }
        System.out.println(max);
    }
}
