import java.util.Scanner;

public class Test2_no30 {
    public static int min(int a, int b) {
        return a < b ? a : b; // 2개의 int형 정수 a,b 중 최솟값을 구하기위해 a가 b보다 작으면? a를 반환하고 아니면 b를 반환
    }
    public static int min(int a, int b, int c) {
        return min(min(a, b), c); // 위의 메서드를 호출하여 a와 b를 비교해서 나온 최솟값과 c를 비교하여 다시 최솟값을 반환 위의 메서드를 2번 연속 사용했다고 보면 된다.
    }
    public static int min(int[] a) {
        int minValue = a[0]; // 배열 a의 최솟값을 구하기 전 a[0]값을 대입하여 초기화
        for (int num : a) { // 배열 a의 모든 요소를 다니면서 각 요소를 num에 할당하라는 의미
            if (num < minValue) { // num에 할당하던 중 만약 minValue 값보다 작다면
                minValue = num; // minValue에 그 값을 대입시켜라
            }
        }
        return minValue; // 반복을 끝내고 minValue 값 반환
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값:");
        int x = sc.nextInt();
        System.out.print("y값:");
        int y = sc.nextInt();
        System.out.print("z값:");
        int z = sc.nextInt();

        System.out.print("배열 a의 요소 수:");
        int n = sc.nextInt();

        int[] a = new int[n]; // 입력받은 요소 수로 a배열 크기 설정

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]:", i);
            a[i] = sc.nextInt(); // 입력받은 값을 a배열의 각 요소에 대입
        }
        int minAB = min(x, y); // 위에 만들어놓은 메서드에 값을 넣고 호출하여 새로운 변수에 대입
        int minABC = min(x, y, z);
        int minA = min(a);

        System.out.printf("x, y의 최솟값은 %d입니다.\n", minAB);
        System.out.printf("x, y, z의 최솟값은 %d입니다.\n", minABC);
        System.out.printf("배열 a의 최솟값은 %d입니다.\n", minA);

        sc.close();
    }
}