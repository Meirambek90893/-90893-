package com.company;

import javax.swing.text.html.ListView;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
     while (true){
         System.out.println("Выберите пункт:");
         System.out.println("1.Сложение");
         System.out.println("2.Вычитание");
         System.out.println("3.Умножение");
         System.out.println("4.Деление");
         System.out.println("5.Выйти");
         int person = scanner.nextInt();
         int result;
         if (person == 5){
             break;
         }else if (person == 1){
             System.out.println("Введите первое число:");
             int a = scanner.nextInt();
             System.out.println("Введите второе число:");
             int b = scanner.nextInt();
             System.out.println("Введите третье число:");
             int c = scanner.nextInt();
             System.out.println("a:"+a);
             System.out.println("b:"+b);
             System.out.println("c:"+c);
             result = a+b+c;
             System.out.println("Ответ:"+result);
         }else if (person == 2){
             System.out.println("Введите первое число:");
             int a = scanner.nextInt();
             System.out.println("Введите второе число:");
             int b = scanner.nextInt();
             System.out.println("Введите третье число:");
             int c = scanner.nextInt();
             System.out.println("a:"+a);
             System.out.println("b:"+b);
             System.out.println("c:"+c);
             result = a-b-c;
             System.out.println("Ответ:"+result);
         }else if (person == 3){
             System.out.println("Введите первое число:");
             int a = scanner.nextInt();
             System.out.println("Введите второе число:");
             int b = scanner.nextInt();
             System.out.println("Введите третье число:");
             int c = scanner.nextInt();
             System.out.println("a:"+a);
             System.out.println("b:"+b);
             System.out.println("c:"+c);
             result = a*b*c;
             System.out.println("Ответ:"+result);
         }else if (person == 4){
             System.out.println("Введите первое число:");
             int a = scanner.nextInt();
             System.out.println("Введите второе число:");
             int b = scanner.nextInt();
             System.out.println("Введите третье число:");
             int c = scanner.nextInt();

             System.out.println("a:"+a);
             System.out.println("b:"+b);
             System.out.println("c:"+c);
             result = a/b/c;
             System.out.println("Ответ:"+result);
         }
     }
     System.out.println("Программа завершена");
    }

}







