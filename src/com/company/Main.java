package com.company;
    //Зеленая тетрадь

    public class Main {

    public static void main(String[] args) {
        int size = 6;
        int realSize = size + 1;
        int[][] arr = new int[realSize][realSize];
        for (int n = 1; n < arr.length; n++) {
            for (int k = 1; k < arr.length; k++) {
                arr[n][k] = n * k;
            }
        }
        int counter = 0;
                for (int x = 1; x < arr.length; x++){
                    for (int y = 1; y < arr.length; y++){
                    if (arr[x][y] == 12){
                    counter = counter+1;
                }
    }
}
                System.out.println(counter);
    }
}

