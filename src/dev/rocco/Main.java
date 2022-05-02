package dev.rocco;

public class Main {

    public static void main(String[] args) {
        int[][] twoDimensional = {{1,5},{2,6},{3,7},{4,8}};
        for (int i = 0 ; i < 4 ; i++) {
            for (int j = 0 ; j < 2; j++){
                System.out.print(twoDimensional[i][j] + " ");
            }
            System.out.println();
        }
    }
}
