import java.util.Scanner;
public class Test2_no2 {
    public static int Min(int a, int b, int c) {  // a, b, c 변수 생성
        int min = a; // a를 최솟값으로 설정
        if (b < min) { // b가 최솟값보다 작으면
            min = b; // b를 최솟값으로 대입
        }
        if (c < min) { // c가 최솟값보다 작으면
            min = c; // c를 최솟값으로 대입
        }
        return min; // 그렇게해서 나온 min 값을 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수a:");
        int a = sc.nextInt();
        System.out.print("정수b:");
        int b = sc.nextInt();
        System.out.print("정수c:");
        int c = sc.nextInt();

        int result = Min(a, b, c); // result라는 변수에 Min 메서드에서 실행한 결과를 대입

        System.out.printf("최솟값은 %d입니다.", result); // result 출력
    }
}
