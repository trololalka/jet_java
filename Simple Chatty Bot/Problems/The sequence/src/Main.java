import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = 0;
        int tmp;
        while (sc.hasNext()) {
            tmp = sc.nextInt();
            if (max < tmp && tmp % 4 == 0) {
                max = tmp;
            }
        }
        System.out.println(max);
    }
}