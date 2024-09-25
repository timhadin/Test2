import java.util.Scanner;

public class Test2_no11 {
    // 시프트 연산 및 결과 출력 메서드
    public static void performShiftOperations(int x, int n) {
        int powShiftLeft = calculatePowerShiftLeft(x, n);
        int powShiftRight = calculatePowerShiftRight(x, n);
        int leftShift = leftShift(x, n);
        int rightShift = rightShift(x, n);
        // 결과 출력
        System.out.println("[a] x * (2의 " + n + "승) = " + powShiftLeft);
        System.out.println("[b] x / (2의 " + n + "승) = " + powShiftRight);
        System.out.println("[c] x << " + n + " = " + leftShift);
        System.out.println("[d] x >> " + n + " = " + rightShift);
        // 값 비교 및 결과 출력
        compareResults(powShiftLeft, leftShift, "[a]", "[c]");
        compareResults(powShiftRight, rightShift, "[b]", "[d]");
    }
    // x * 2^n 계산 메서드
    public static int calculatePowerShiftLeft(int x, int n) {
        return (int) (x * Math.pow(2, n));
    }
    // x / 2^n 계산 메서드
    public static int calculatePowerShiftRight(int x, int n) {
        return (int) (x / Math.pow(2, n));
    }
    // x << n 시프트 연산 메서드
    public static int leftShift(int x, int n) {
        return x << n;
    }
    // x >> n 시프트 연산 메서드
    public static int rightShift(int x, int n) {
        return x >> n;
    }
    // 결과 비교 메서드
    public static void compareResults(int calc1, int calc2, String label1, String label2) {
        if (calc1 == calc2) {
            System.out.println(label1 + "와 " + label2 + "의 값이 일치합니다.");
        } else {
            System.out.println(label1 + "와 " + label2 + "의 값이 일치하지 않습니다.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 x를 n비트 시프트합니다.");
        System.out.print("x: ");
        int x = scanner.nextInt(); // 정수 x 입력받기

        System.out.print("n: ");
        int n = scanner.nextInt(); // 시프트 값 n 입력받기

        // 메서드를 사용하여 결과 출력
        performShiftOperations(x, n);

        scanner.close();
    }
}
