import java.util.Scanner;
public class Test2_no1 {
    public static int sign(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 0;
        } else
            return 1;
    }

    public static void main(String[] args) {
        System.out.print("정수x:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int number = sign(num);

        System.out.printf("signof(x)는 %d입니다.", number);
    }
}
