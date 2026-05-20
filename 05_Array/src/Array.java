import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) throws Exception {
        String[] str = new String[4];
        Scanner scanner = new Scanner(System.in);

        // for (int i = 0; i < str.length; i++) {
        // str[i] = scanner.nextLine();
        // }

        // for (String temp : str) {
        // System.out.println(temp);
        // }

        String[] names = { "ASd", "WFW" };
        String[] newArray = new String[5];
        System.arraycopy(names, 0, newArray, 0, 1);
        names = newArray;
        System.out.println(Arrays.toString(newArray)); // for 없이 출력
        System.out.println(names[1]);
        // Rotate();
        scanner.close();
    }

    static int[][] T = {
            { 1, 1, 1, 1, 1 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 0 }
    };

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
