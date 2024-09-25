import java.util.Scanner;
public class Test2_no14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트부터 n개의 비트를 변경합니다.");
        System.out.print("x: ");
        int x = scanner.nextInt(); // 정수 x 입력받기

        System.out.print("pos: ");
        int pos = scanner.nextInt(); // 시작 위치 pos 입력받기

        System.out.print("n: ");
        int n = scanner.nextInt(); // 비트 개수 n 입력받기

        // 결과 출력
        System.out.println("x = " + toBinaryString(x));
        System.out.println("setN(x, pos, n) = " + toBinaryString(setN(x, pos, n)));
        System.out.println("resetN(x, pos, n) = " + toBinaryString(resetN(x, pos, n)));
        System.out.println("inverseN(x, pos, n) = " + toBinaryString(inverseN(x, pos, n)));

        // Scanner 닫기
        scanner.close();
    }

    public static int setN(int x, int pos, int n) {
        int mask = ((1 << n) - 1) << pos;
        return x | mask;
    }

    public static int resetN(int x, int pos, int n) {
        int mask = ~(((1 << n) - 1) << pos);
        return x & mask;
    }

    public static int inverseN(int x, int pos, int n) {
        int mask = ((1 << n) - 1) << pos;
        return x ^ mask;
    }

    public static String toBinaryString(int num) {
        return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
    }
}
