//Спираль Улама

public class Spiral {

    public static void main(String[] args) {
        int n = 15;
        int[][] array = new int[n][n];
        int x = n/2;
        int y = n/2;
        array[x][y] = 1;
        int min_x = x;
        int max_x = x;
        int min_y = y;
        int max_y = y;
        int go = 3;
        for (int a = 1; a <= n * n; a++) {
            array[x][y] = a;
            switch (go) {
                case 0:
                    x -= 1;
                    if (x < min_x) {
                        go = 1;
                        min_x = x;
                    }
                    break;
                case 1:
                    y -= 1;
                    if (y < min_y) {
                        go = 2;
                        min_y = y;
                    }
                    break;
                case 2:
                    x += 1;
                    if (x > max_x) {
                        go = 3;
                        max_x = x;
                    }
                    break;
                case 3:
                    y += 1;
                    if (y > max_y) {
                        go = 0;
                        max_y = y;
                    }
            }
        }
        printArray(array);
    }
    public static void printArray (int[][] matrix){
            for (int[] array : matrix) {
                for (int anInt : array) {
                    System.out.print(String.format("%5d", anInt));
                }
                System.out.println();
            }
        }
    }

