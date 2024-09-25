import java.util.Scanner;
public class Test2_no19 {
    public static void aryRmvN(int[] a, int idx, int n) {
        for (int i = idx; i < a.length - n; i++) { // idx칸에서 시작해서 배열의 끝-n번째 까지 반복
            a[i] = a[i + n]; // a배열 i칸에 i+n칸 대입
        }
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

        System.out.print("삭제를 시작할 인덱스:");
        int remove = scanner.nextInt();
        System.out.print("삭제할 요소의 수:");
        int remove2 = scanner.nextInt();

        aryRmvN(array, remove, remove2);

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
        scanner.close();
    }
}