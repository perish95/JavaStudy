public class CAndL {
    static int[][] T = {
            { 1, 1, 1, 1, 1 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 }
    };

    public static void main(String[] args) throws Exception {
        // 별찍기
        // for (int i = 4; i >= 0; i--) {
        // for (int j = i; j >= 0; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        Rotate();
    }

    // 07배열과제 10번
    private static void Rotate() {
        int[][] temp = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                temp[j][4 - i] = T[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
