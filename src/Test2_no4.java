import java.util.Scanner;
public class Test2_no4 {
        public static int sumUp(int n) {

            int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 x까지의 합을 구하자.");
        System.out.print("x의 값:");
        int n = sc.nextInt();
        System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sumUp(n));
    }
}
