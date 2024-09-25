import java.util.Scanner;
public class Test2_no13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트를 변경합니다.");
        System.out.print("x: ");
        int x = scanner.nextInt(); // 정수 x 입력받기

        System.out.print("pos: ");
        int pos = scanner.nextInt(); // 위치 pos 입력받기

        // 결과 출력
        System.out.println("x = " + toBinaryString(x));
        System.out.println("set(x, pos) = " + toBinaryString(set(x, pos)));
        System.out.println("reset(x, pos) = " + toBinaryString(reset(x, pos)));
        System.out.println("inverse(x, pos) = " + toBinaryString(inverse(x, pos)));

        // Scanner 닫기
        scanner.close();
    }

    public static int set(int x, int pos) {
        return x | (1 << pos);
    }

    public static int reset(int x, int pos) {
        return x & ~(1 << pos);
    }

    public static int inverse(int x, int pos) {
        return x ^ (1 << pos);
    }

    private static String toBinaryString(int num) {
        return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
    }
}
