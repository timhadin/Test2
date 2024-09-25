import java.util.Scanner;
public class Test2_no17 {
    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) { // 배열 0부터 검색하면서 key랑 같은 값이 있다면
                return i; // i 반환
            }
        }
        return -1; // 일반적으로 검색에서 값이 발견되지 않았을때 나타내는 방법
                   // 배열은 0부터 시작하므로 -1을 반환한다는건 값이 없다는걸 나타내기에 적합함
    }

    public static int linearSearchR(int[] a, int key) {
        for (int i = a.length - 1; i >= 0; i--) { // 배열의 끝 위치에서 시작해 하나씩 줄여나가며 검색하다가
            if (a[i] == key) { // key랑 같은 값이 발견되면
                return i; // i 반환
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = scanner.nextInt();
        int[] array = new int[n]; // 입력받은 요소들을 저장하기위한 배열 선언

        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d]:", i);
            array[i] = scanner.nextInt(); // 배열에 입력받은 값 저장
        }

        System.out.print("찾는 값: ");
        int key = scanner.nextInt(); // 찾는 값을 key로 설정하여 위의 메서드와 연관

        int firstIndex = linearSearch(array, key); // 위 메서드의 반환값을 저장하기 위한 변수 생성
        int lastIndex = linearSearchR(array, key);

        if (firstIndex != -1 && lastIndex != -1) { // 만약 반환 값이 -1이 아니라면
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x[" + firstIndex + "]에 있습니다.");
            System.out.println("가장 뒤에 위치한 값은 x[" + lastIndex + "]에 있습니다.");
        }
        scanner.close(); // scanner를 닫지 않으면 리소스 누수가 발생할 수 있음 그렇기때문에 close 필요
    }
}