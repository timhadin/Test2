import java.util.Scanner;

public class Test2_no31 {
    public static int absolute(int x) { // 정수 x의 절댓값 구하는 메서드
        return x < 0 ? -x : x; // x가 0보다 작으면? x앞에 -부호를 붙이고 : x (x를 반환하라는 의미)
    }
    public static long absolute(long x) {
        return x < 0 ? -x : x;
    }
    public static float absolute(float x) {
        return x < 0 ? -x : x;
    }
    public static double absolute(double x) {
        return x < 0 ? -x : x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("int   형 정수 a의 값:");
        int a = scanner.nextInt();
        System.out.print("long  형 정수 b의 값:");
        long b = scanner.nextInt();
        System.out.print("float 형 정수 c의 값:");
        float c = scanner.nextFloat();
        System.out.print("double형 정수 d의 값:");
        double d = scanner.nextDouble();

        System.out.printf("a의 절댓값은 %d입니다.\n", absolute(a));
        System.out.printf("b의 절댓값은 %d입니다.\n", absolute(b));
        System.out.printf("c의 절댓값은 %.1f입니다.\n", absolute(c)); // 소숫점 1자리까지만 표시하기위해 .1f
        System.out.printf("d의 절댓값은 %.1f입니다.\n", absolute(d));
    }
}
