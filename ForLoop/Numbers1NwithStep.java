package ForLoopLab;

import java.util.Scanner;

public class Numbers1NwithStep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for( int i=1;i<=n;i+=3){
            System.out.println(i);
        }
        
    }
}
