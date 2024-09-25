public class Test2_no27 {
    public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
        int hang = x.length; // x배열의 행 수 hang에 할당
        int yeol = x[0].length; // x배열의 열 수 yeol에 할당

        if (hang != y.length || hang != z.length || yeol != y[0].length || yeol != z[0].length) {
            // hang이 y배열의 행,열 수와 같지 않거나, z배열의 행,열 수와 같지 않다면
            return false; // false 반환
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < yeol; j++) {
                z[i][j] = x[i][j] + y[i][j]; // 두 행렬을 더하기 위한 사전작업
            }
        }
        return true; // true 반환
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("행렬");
        for (int[] row : matrix) { // 2차원 배열 matrix의 각 행을 row에 할당
            for (int elem : row) { // row의 각 요소를 elem에 할당
                System.out.print(elem + " "); // elem 출력하고 공백 한 칸씩
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] x = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] y = {
                {6, 3, 4},
                {5, 1, 2}
        };
        int[][] z = new int[2][3]; // 2차원 배열 z를 만들고 크기를 2x3으로 설정

        printMatrix(x); // 메서드 호출
        printMatrix(y);

        if (addMatrix(x, y, z)) { // addMatrix 메서드를 통해 x,y배열을 더한 z배열 생성
            System.out.println("합");
            for (int[] row : z) { // z배열을 표시할 때 숫자 한 칸씩 띄우기 위한 코드
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    }
}
