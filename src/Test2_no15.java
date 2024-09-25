import java.util.Scanner;
public class Test2_no15 {
    public static int sumof(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수:");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]:", i);
            x[i] = sc.nextInt();
        }
        System.out.printf("모든 요소의 합은 %d입니다.", sumof(x));
    }
}

// sumof 메서드에서 배열의 길이가 정해지지 않았기때문에 i < a.length 작성
// 요소들을 입력받아 저장하기위해 x 배열 선언
// for 문으로 x 배열의 각 위치에 입력값 저장
// sumof 메서드 호출하여 모든 요소의 합 출력