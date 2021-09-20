package com.studyopedia;

import java.util.Objects;
import java.util.Scanner;

public class LcUc2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        int x1= sc.nextInt();
        System.out.println("Enter x2");
        int x2= sc.nextInt();
        System.out.println("Enter y1");
        int y1= sc.nextInt();
        System.out.println("Enter y2");
        int y2= sc.nextInt();
        System.out.println("Enter a1");
        int a1= sc.nextInt();
        System.out.println("Enter a2");
        int a2= sc.nextInt();
        System.out.println("Enter b1");
        int b1= sc.nextInt();
        System.out.println("Enter b2");
        int b2= sc.nextInt();
        double Length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double Length2 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
        System.out.println(Objects.equals(Length1, Length2));
    }
}
