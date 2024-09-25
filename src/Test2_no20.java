import java.util.Scanner;
public class Test2_no20 {
    public static void aryIns(int[] a, int idx, int x) {
        for (int i = a.length - 1; i > idx; i--) { // 배열의 끝 -1부터 idx 바로 다음칸까지 반복
            a[i] = a[i - 1]; // 배열 a의 i번째 칸에 i-1칸을 대입 (하나씩 뒤로 밀리게 됨)
        }
        a[idx] = x; // idx칸에 새로운 x대입 (위에서 한칸씩 뒤로 밀었기때문에 x를 대입할 수 있는 공간 생성)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스:");
        int add = scanner.nextInt();
        System.out.print("삽입할 값:");
        int add2 = scanner.nextInt();

        aryIns(array, add, add2); // 삽입할 요소의 인덱스와 값을 위의 메서드에 넣어 호출

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
        scanner.close();
    }
}