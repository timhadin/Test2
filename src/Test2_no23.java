import java.util.Scanner;
public class Test2_no23 {
    public static int[] arraySrchIdx(int[] a, int x) {
        int count = 0; // count 초기화
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) { // 배열 a의 모든 요소를 검색 중 x랑 같은 값이 나오면
                count++; // count+1
            }
        }
        if (count == 0) {
            return new int[0]; // count가 0이면 빈 배열을 반환
        }
        int[] result = new int[count]; // 길이가 count인 result 배열 생성
        int index = 0; //
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = scanner.nextInt();
        int[] array = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.printf("a[%d]:", i);
            array[i] = scanner.nextInt();
        }
        System.out.print("탐색할 값:");
        int x = scanner.nextInt();

        int[] indexes = arraySrchIdx(array, x);

        if (indexes.length != 0) {
            System.out.println("일치하는 요소의 인덱스");
            for (int i = 0; i < indexes.length; i++) {
                System.out.printf("%d%n", indexes[i]);
            }
        }
    }
}