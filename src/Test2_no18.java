import java.util.Scanner;
public class Test2_no18 {
    public static void aryRmv(int[] a, int idx) { // 요소 삭제하는 메서드
        for (int i = idx; i < a.length - 1; i++) { // 삭제하고자하는 요소로부터 배열의 끝 -1까지 반복
            a[i] = a[i + 1]; // 삭제하고자하는 요소에 그 다음 요소를 덮어씌움
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = scanner.nextInt();
        int[] array = new int[n]; // 아래의 반복문에서 입력받은 값 저장하기위한 배열 선언

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            array[i] = scanner.nextInt(); // 배열 i번째에 입력될 정수 대입
        }

        System.out.print("삭제할 요소의 인덱스:");
        int idxToRemove = scanner.nextInt();
        aryRmv(array, idxToRemove); // 요소 삭제하는 인덱스에 array배열 넣고 삭제할 요소 넣은 뒤 호출

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
        scanner.close();
    }
}