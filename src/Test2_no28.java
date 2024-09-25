import java.util.Scanner;

public class Test2_no28 {
    public static int[][] addMatrix(int[][] x, int[][] y) {
        int rows = x.length; // rows 라는 변수에 x 배열의 행 '수'를 대입
        int cols = x[0].length; // cols 라는 변수에 x 배열의 열 '수'를 대입
        int[][] result = new int[rows][cols]; // result 2차원 배열에 rows cols를 넣어 x배열의 크기와 동일한 배열 생성

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = x[i][j] + y[i][j]; // 행렬 c를 만들어주기 위한 선작업.
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix, String name) {
        System.out.print(name);
        for (int[] row : matrix) { // matrix의 각 행을 row 배열에 할당
            for (int value : row) { // row 배열의 각 요소를 value에 할당
                System.out.print(value + " "); // 한 칸씩 띄우며 출력
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("행렬의 행 수:");
        int rows = scanner.nextInt();
        System.out.print("행렬의 열 수:");
        int cols = scanner.nextInt();

        int[][] a = new int[rows][cols]; // 입력받은 행과 열의 수로 2차원 배열을 생성하고
        int[][] b = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.printf("a[%d][%d]:", i, j);
                a[i][j] = scanner.nextInt(); // 각 요소에 값을 입력 받는다.
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.printf("b[%d][%d]:", i, j);
                b[i][j] = scanner.nextInt(); // b 배열도 같은 방법으로 진행
            }
        }
        printMatrix(a, "행렬a\n");
        printMatrix(b, "행렬b\n");

        int[][] c = addMatrix(a, b);

        printMatrix(c, "행렬c\n");

        scanner.close();
    }
}