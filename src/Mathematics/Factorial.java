package Mathematics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {

    static   int fact(int n){
        int res=1;
        for(int i=1; i<=n; i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));

    }
}
