import java.util.Scanner;
public class Test2_no25 {
    public static void aryRmv(int[] a, int idx, int count) {
        for (int i = idx; i < a.length - count; i++) { // idx번째부터 시작해서 a배열의 끝 - count번째 까지
            a[i] = a[i + count]; // a배열의 i번째에 i + count번째의 값 대입(요소를 원하는만큼 삭제한뒤에 앞으로 당기기위해)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]:", i);
            array[i] = scanner.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스:");
        int idx = scanner.nextInt();

        System.out.print("삭제할 요소의 개수:");
        int count = scanner.nextInt();

        aryRmv(array, idx, count);

        for (int i = 0; i < n - count; i++) { // 전체 요소에서 count를 뺀 만큼만 반복하며
            System.out.printf("y[%d] = %d%n", i, array[i]); // 출력
        }
        scanner.close();
    }
}