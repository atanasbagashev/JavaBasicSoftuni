package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int currentNum=0;

        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                currentNum++;
                if(currentNum>n){
                    break;
                }
                System.out.print( currentNum + " ");



            }
            System.out.println();

        }

    }
}
