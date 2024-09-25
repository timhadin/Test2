import java.util.Scanner;
public class Test2_no2 {
    public static int Min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a:");
        int a = sc.nextInt();
        System.out.print("정수b:");
        int b = sc.nextInt();
        System.out.print("정수c:");
        int c = sc.nextInt();

        int result = Min(a, b, c);

        System.out.printf("최솟값은 %d입니다.", result);
    }
}

// 1. a를 최솟값으로 초기화
// 2. a와 b를 비교해서 b가 더 작다면 b를 최솟값으로 설정
// 3. b가 더 크다면 a와 c를 비교하고 c가 더 작다면 c를 최솟값으로 설정
// 4. c가 더 크다면 a를 최솟값으로 유지