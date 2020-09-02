import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        int p = sc.nextInt();
        double k = sc.nextInt();
        int i = 0;
        while (m < k) {
            m += m * p / 100.0;
            i++;
        }
        System.out.println(i);
    }
}