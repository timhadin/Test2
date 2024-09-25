import java.util.Scanner;

public class Test2_no26 {
    public static int[] arrayInsof(int[] a, int idx, int x) {
        int[] newArray = new int[a.length + 1]; // 기존 배열 a보다 하나 더 큰 배열 생성

        for (int i = 0; i < idx; i++) {
            newArray[i] = a[i]; // idx 이전까지의 요소를 그대로 newArray 배열에 붙여넣기
        }
        newArray[idx] = x; // newArray 배열 idx번째에 x 삽입

        for (int i = idx; i < a.length; i++) { // idx번째부터 시작해서 a배열의 끝까지
            newArray[i + 1] = a[i]; // newArray배열의 i+1번째에 a배열의 i번째 값을 대입(한 칸씩 뒤로 미는 작업)
        }
        return newArray; // 최종 newArray를 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = scanner.nextInt();
        int[] array = new int[n]; // 요소 수 입력받아 배열의 크기 설정

        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]:", i);
            array[i] = scanner.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스:");
        int add = scanner.nextInt();
        System.out.print("삽입할 값:");
        int add2 = scanner.nextInt();

        array = arrayInsof(array, add, add2);

        for (int i = 0; i < array.length; i++) { // 0부터 array배열 끝까지
            System.out.printf("y[%d] = %d%n", i, array[i]); // 출력
        }
        scanner.close();
    }
}