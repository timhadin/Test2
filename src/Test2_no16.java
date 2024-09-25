import java.util.Scanner;
public class Test2_no16 {
    public static int minof(int[] a) { // 최솟값을 구하기 위한 메서드
        int min = a[0]; // 다른 값과의 비교 전 최솟값을 a[0]으로 초기화
        for (int i=1; i<a.length; i++) { // i 1부터 a라는 배열의 길이까지
            if (a[i] < a[0]) // 만약 기존에 설정한 최솟값인 a[0]보다 작으면
                min = a[i]; // 새롭게 최솟값으로 대입
        }
        return min; // 최종 최솟값 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수는:");
        int num = sc.nextInt();
        System.out.printf("%d명의 신장과 체중을 입력하자.\n", num);

        int[] cmm = new int[num]; // 배열 선언하여 입력값 저장할 준비
        int[] kgg = new int[num];

        for (int i=0; i<num; i++) {
            System.out.printf("%d번의 신장:", i+1);
            cmm[i] = sc.nextInt(); // 입력값 저장
            System.out.printf("%d번의 체중:", i+1);
            kgg[i] = sc.nextInt();
        }
        System.out.printf("가장 키가 작은 사람의 신장:%dcm\n", minof(cmm)); // 메서드 호출하여 최솟값 출력
        System.out.printf("가장 마른 사람의 체중:%dkg\n", minof(kgg));
    }
}