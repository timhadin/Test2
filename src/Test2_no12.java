import java.util.Scanner;
public class Test2_no12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 x를 n비트 회전합니다.");
        System.out.print("x: ");
        int x = scanner.nextInt(); // 정수 x 입력받기

        System.out.print("n: ");
        int n = scanner.nextInt(); // 회전 값 n 입력받기

        // 회전 결과 계산 및 출력
        printRotationResults(x, n);

        // Scanner 닫기
        scanner.close();
    }

    public static void printRotationResults(int x, int n) {
        String originalBinary = Integer.toBinaryString(x);
        String rightRotated = rRotate(x, n);
        String leftRotated = lRotate(x, n);

        System.out.println("회전 전 = " + padBinaryString(originalBinary));
        System.out.println("오른쪽 회전 = " + padBinaryString(rightRotated));
        System.out.println("왼쪽 회전 = " + padBinaryString(leftRotated));
    }

    public static String rRotate(int num, int shift) {
        int bits = Integer.SIZE; // 32비트 기준
        shift %= bits;
        int rotated = (num >>> shift) | (num << (bits - shift));
        return Integer.toBinaryString(rotated);
    }

    public static String lRotate(int num, int shift) {
        int bits = Integer.SIZE; // 32비트 기준
        shift %= bits;
        int rotated = (num << shift) | (num >>> (bits - shift));
        return Integer.toBinaryString(rotated);
    }

    public static String padBinaryString(String binary) {
        return String.format("%32s", binary).replace(' ', '0');
    }
}
