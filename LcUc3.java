package com.studyopedia;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class LcUc3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        out.println("enter x1");
        int x1= sc.nextInt();
        out.println("Enter x2");
        int x2= sc.nextInt();
        out.println("enter y1");
        int y1= sc.nextInt();
        out.println("enter y2");
        int y2= sc.nextInt();
        out.println("enter a1");
        int a1= sc.nextInt();
        out.println("enter a2");
        int a2= sc.nextInt();
        out.println("enter b1");
        int b1= sc.nextInt();
        out.println("enter b2");
        int b2= sc.nextInt();
        double Length1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double Length2 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
        String L1= String.valueOf(Length1);
        String L2= String.valueOf(Length2);
        System.out.println( L1.compareTo(L2));
    }
}
