import java.util.Scanner;
public class Test2_no21 {
    public static void aryExchng(int[] a, int[] b) {
        int minLength = Math.min(a.length, b.length);
        for (int i = 0; i < minLength; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열 a의 요소 수:");
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]:", i);
            arrayA[i] = scanner.nextInt();
        }

        System.out.print("배열 b의 요소 수:");
        int m = scanner.nextInt();
        int[] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("b[%d]:", i);
            arrayB[i] = scanner.nextInt();
        }
        aryExchng(arrayA, arrayB);

        System.out.println("배열 a와 b의 값을 교환했습니다.");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + arrayA[i]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println("b[" + i + "] = " + arrayB[i]);
        }
    }
}