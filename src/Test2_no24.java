import java.util.Scanner;
public class Test2_no24 {
    public static int[] arrayRmvof(int[] a, int idx) {
        int[] newArray = new int[a.length - 1]; // a배열의 길이에서 -1하고 newArray배열에 할당
        for (int i = 0; i < idx; i++) { // idx(삭제할위치) 전까지
            newArray[i] = a[i]; // newArray배열에 a배열 대입(삭제위치 전까지는 그대로 복사하기 위해)
        }
        for (int i = idx; i < newArray.length; i++) { // idx부터 newArray 끝까지
            newArray[i] = a[i + 1]; // newArray[i]에 a[i + 1]의 값을 대입한다.(한 칸씩 앞으로 당겨지게된다.)
        }
        return newArray; // newArray 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = scanner.nextInt();
        int[] array = new int[num]; // 요소 수를 입력받아 배열의 크기 정하고

        for(int i = 0; i < num; i++) {
            System.out.printf("a[%d]:", i);
            array[i] = scanner.nextInt(); // 각 요소에 값을 입력 받는다.
        }
        System.out.print("삭제할 요소의 인덱스:");
        int idx = scanner.nextInt();
        int[] result = arrayRmvof(array, idx);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("y[%d] = %d%n", i, result[i]);
        }
    }
}