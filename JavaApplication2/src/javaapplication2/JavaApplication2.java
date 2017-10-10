package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

   
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        double fnum,snum,ans;
        System.out.println("Give first number");
        fnum = a.nextDouble();
        System.out.println("Give second number");
        snum = a.nextDouble();
        ans = fnum + snum;
        
        System.out.println(ans);
        
       
    }
    
}
