package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;


//////////////////////////lab4zad1////////////////
/*public class Main {

    public static void main(String[] args) {
        final int f = 25;
        boolean t=true;
        int min=0,max=0;
        int[] a = new int [f];
        int b =a.length;
        for (int i = 0 ; i < f ; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));

         for (int i = 0 ; i < b ; i++) {
            if(t){
                min=a[i];
                max=a[i];
                t=false;
            }
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i = 0 ; i < b ; i++) {
            if(a[i]==min){
                a[i]=max;
            }
            else {
                if(a[i]==max){
                    a[i]=min;
                }}
        }
         System.out.println(Arrays.toString(a));
}}     */
//////////////////////////lab4zad2////////////////
/*public class Main {

  public static void main(String[] args) {
      final int f = 25;
      int[] a = new int[f];
      int min=0,max=0;
      int temp=0;
      for (int i = 0; i < f; i++) {
          int r = (int) (Math.random() * 25 + 1);
          a[i] = r;
      }
      System.out.println(Arrays.toString(a));
      for (int j = 0; j < a.length-1; j++) {
          for (int i = 0; i < a.length - 1; i++) {
              if (a[i] > a[i + 1]) {
                  temp = a[i];
                  a[i] = a[i + 1];
                  a[i + 1] = temp;
              }
          }
      }  System.out.println(Arrays.toString(a));

      }
  }*/


//////////////////////////lab4zad3////////////////
/*public class Main{
    public static void main (String[] arg){
           
       int e=0;
       final int f = 21;
       int[] a = new int [f];
       for (int i = 0; i < f; i++) {
           a[i]=i;
       }
       System.out.println(Arrays.toString(c));
       for (int i = 0; i < f; i++) {
           e+=a[i];
       }
       e=e/21;
       
       System.out.println(e);
               }

}        */
//////////////////////////lab4zad4////////////////
/*public class Main {
    public static void main(String[] arg) {
        int c=0, b=0;
        final int f = 31;
        int[] a = new int[f];
        for (int i = 0; i < f; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < f; i++) {
            if (i != 0) {
                if (i % 2 == 0) {
                    c++;
                } else {
                    b++;

                }
            }
        }
        System.out.println("сумма четных: " + c + " сумма нечетных: " + b);
    }}*/
//////////////////////////lab4zad5////////////////
/*public class Main{
    public static void main(String[] arg){
        int [][] a= new int [3][5];
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                int r = (int) (Math.random() * 10);
                a[i][j] = r;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}*/
//////////////////////////lab4zad6////////////////
/*public class Main {
public static void main(String[] arg){
    final int f = 25;
    boolean t=true;
    int min=0,max=0;
    int[] a = new int [f];
    int b =a.length;
    for (int i = 0 ; i < f ; i++) {
        a[i]=i;
    }
    System.out.println(Arrays.toString(a));

    for (int i = 0 ; i < b ; i++) {
        if(t){
            min=a[i];
            max=a[i];
            t=false;
        }
        if(a[i]<min){
            min=a[i];
        }
        if(a[i]>max){
            max=a[i];
        }
    }
    for (int i = 0 ; i < b ; i++) {
        if(a[i]==min){
            a[i]=max;
        }
        else {
            if(a[i]==max){
                a[i]=min;
            }}
    }
    System.out.println(Arrays.toString(a));
    maxX(max);
}
public static void maxX(int max){
    System.out.println(max);
}
}*/
//////////////////////////lab4zad7////////////////
/*public class Main{
    public static void main(String[] arg){
        String s1=" 1 ", s2=" 2 ", s3=" 3 ", s4=" 4 ", s5=" 5 ";
        if(s4.equals(s5)){
            System.out.println(s1+s2);
        }else{
            System.out.println(s1+s3);
    }
}}*/