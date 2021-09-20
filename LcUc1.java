package com.studyopedia;

import java.util.Scanner;

public class LcUc1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        int x1= sc.nextInt();
        System.out.println("Enter x2");
        int x2= sc.nextInt();
        System.out.println("Enter y1");
        int y1 =sc.nextInt();
        System.out.println("Enter y2");
        int y2=sc.nextInt();
        double Length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.print(Length);
    }
}
