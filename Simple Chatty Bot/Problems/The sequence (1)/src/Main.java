import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int thisTimes = 0;
        for (int i = 1; thisTimes < times; i++) {
            for (int j = 0; j < i; j++, thisTimes++) {
                if (thisTimes == times) {
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}