package org.example;

import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        System.out.println(">>");
        Scanner sc = new Scanner(System.in);
        String title = "["+sc.nextLine()+"]";

        float s = sc.nextFloat();
        int score = (int)s;
        float ratio = (s/5)*100;

        String recipe1=sc.nextLine();
        String recipe2=sc.nextLine();
        String recipe3=sc.nextLine();
        String recipe4=sc.nextLine();
        String recipe5=sc.nextLine();
        String recipe6=sc.nextLine();
        String recipe7=sc.nextLine();
        String recipe8=sc.nextLine();
        String recipe9=sc.nextLine();
        String recipe10=sc.nextLine();

        System.out.println(title);
        System.out.println("점수:"+s+"("+ratio+"% )");
        System.out.println("1."+recipe1);
        System.out.println("2."+recipe2);
        System.out.println("3."+recipe3);
        System.out.println("4."+recipe4);
        System.out.println("5."+recipe5);
        System.out.println("6."+recipe6);
        System.out.println("7."+recipe7);
        System.out.println("8."+recipe8);
        System.out.println("9."+recipe9);
        System.out.println("10."+recipe10);



    }
}
