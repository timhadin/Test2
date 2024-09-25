import java.util.Scanner;

public class Test2_no29 {
    public static int[][] aryClone2(int[][] a) {
        int rows = a.length; // rows행을 선언하고 a배열의 length 값을 대입한다.
        int[][] clone = new int[rows][]; // clone 배열을 선언하고 위에서 대입받은 rows행을 clone 배열의 행으로 넣는다.

        for (int i = 0; i < rows; i++) {
            clone[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                clone[i][j] = a[i][j];
            }
        }
        return clone;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("행렬의 행 수:");
        int rows = sc.nextInt(); // 행 수를 입력받고
        System.out.print("행렬의 열 수:");
        int cols = sc.nextInt(); // 열 수를 입력받으면

        int[][] a = new int[rows][cols]; // 입력받은 행, 열을 a 배열에 넣는다. (위의 메서드 a 배열과는 다른 a)

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("a[%d][%d]:", i, j);
                a[i][j] = sc.nextInt(); // 행렬의 각 요소에 값을 입력받고
            }
        }
        int[][] clone = aryClone2(a); // clone 2차원 배열에 지금까지 만들어 놓은 a 배열을 aryClone2 메서드에 넣고 호출, 대입한다.

        System.out.println("행렬a");
        for (int[] row : a) { // 배열 a의 모든 요소를 순회하면서 각 행이 row 라는 1차원 배열에 저장한다.
            for (int elem : row) { // 그 다음 row 배열의 각 요소를 elem 이라는 정수에 저장한다.
                System.out.print(elem + " "); // 마지막 elem 을 출력하면서 중간에 한 칸씩 띄운다.
            }                                 // 2차원 배열을 출력하고 각 숫자 사이에 공백을 채워넣는 방법
            System.out.println();
        }
        System.out.println("행렬a의 복사본");
        for (int[] row : clone) { // clone 배열의 각 행을 row 배열에 할당
            for (int elem : row) { // row 배열의 각 요소를 elem 정수에 할당
                System.out.print(elem + " "); // elem 출력하면서 공백 한 칸씩
            }
            System.out.println();
        }
        sc.close();
    }
}