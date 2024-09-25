import java.util.Scanner;

public class Test2_no32 {
    public static void printArray(int[] a) { // 1차원 배열 x를 만들기 위한 메서드
        for (int i = 0; i < a.length; i++) { // i는 a배열의 길이 미만으로 반복하며
            System.out.print(a[i]); // a배열을 출력한다.
            if (i < a.length - 1) { // 만약 i가 a배열의 길이 -1 보다 작다면
                System.out.print(" "); // 공백을 출력한다. (숫자 사이사이 공백이 다 들어간다고 보면 된다.)
            }
        }
        System.out.println(); // 출력 후 줄 바꿈
    }
    public static void printArray(int[][] a) { // 2차원 배열 y를 만들기 위한 메서드
        for (int i = 0; i < a.length; i++) { // 반복문 행 부분
            for (int j = 0; j < a[i].length; j++) { // 반복문 열 부분
                System.out.print(String.format("%-5d", a[i][j])); // 출력할때 왼쪽에 맞추어 정렬하기위해 각 숫자마다의 공간을 확보한다.
                                                                  // 공간을 확보해놓으면 1을 입력하더라도 뒤에 빈 공간이 생긴다.
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1차원 배열 x의 요소 수:");
        int n = scanner.nextInt(); // 요소 수를 입력받아
        int[] x = new int[n]; // 입력받은 요소 수만큼의 배열 생성
        for (int i = 0; i < n; i++) { // 조건식은 입력받은 요소 수 미만으로
            System.out.printf("x[%d]:", i);
            x[i] = scanner.nextInt(); // x배열의 각 요소에 입력받기
        }
        System.out.print("2차원 배열 y의 행 수:");
        int m = scanner.nextInt(); // 2차원 배열 y를 만들기위해 행의 갯수를 입력받고
        System.out.print("2차원 배열 y의 열 수:");
        int cols = scanner.nextInt(); // 열을 입력받은 다음
        int[][] y = new int[m][cols]; // 2차원 배열 y를 선언하고 입력받은 행, 열 갯수로 크기 설정한다.

        for (int i = 0; i < m; i++) { // 행 담당하는 반복문
            for (int j = 0; j < cols; j++) { // 열 담당하는 반복문
                System.out.printf("y[%d][%d]:", i, j); // i가 0일때 00 01 02 03 이런식으로 만들어진다.
                y[i][j] = scanner.nextInt(); // 역시 00 01 02 03 순서대로 값을 입력받게 된다.
            }
        }
        System.out.println("1차원 배열x");
        printArray(x); // 1차원 배열 x의 요소 수 입력받을때 만들고 값을 입력받았던 x배열을 1차원 배열만들기 메서드에 넣는다.

        System.out.println("2차원 배열y");
        printArray(y);

        scanner.close();
    }
}
