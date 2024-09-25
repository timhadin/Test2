import java.util.Scanner;
public class Test2_no22 {
    public static int[] arrayClone(int[] a) { // 배열 복사를 위한 메서드
        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = scanner.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]:", i);
            int num2 = scanner.nextInt();
            array[i] = num2;
        }

        int[] arrayCopy = arrayClone(array);

        System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");

        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.printf("y[%d] = %d%n", i, arrayCopy[i]);
        }
        scanner.close();
    }
}